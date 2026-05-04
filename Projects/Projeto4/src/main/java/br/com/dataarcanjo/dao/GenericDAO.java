package br.com.dataarcanjo.dao;

import java.io.Serializable;
import java.util.Collection;

import br.com.dataarcanjo.exceptions.DAOException;
import jakarta.persistence.EntityManager;

public abstract class GenericDAO<T extends Persistent, E extends Serializable> {
	/*
	 * Estou armazenando a classe do objeto a ser tratada pelo hibernate. Pois não é posível usar o generic "T" para chamar um .class
	 */
	private Class<T> entityClass;
	
	public GenericDAO(Class<T> entityClass) {
		this.entityClass = entityClass;
	}

	public void save(T entity) {
        EntityManager em = ConnectionFactory.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(entity);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw new DAOException("Error saving entity", e);
        } finally {
            em.close();
        }
    }
	public T findById(E id) {
		EntityManager entityManager = ConnectionFactory.getEntityManager();
		
		try {
			return entityManager.find(entityClass, id);
			
		} catch (Exception e) {
			throw new DAOException("Error during search (RunTime): ", e);
			
		} finally {
			entityManager.close();
		}	
	}

	public void update(T entity) {
        EntityManager em = ConnectionFactory.getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(entity);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw new DAOException("Error updating entity", e);
        } finally {
            em.close();
        }
    }

	public void delete(T entity) {
	    EntityManager em = ConnectionFactory.getEntityManager();
	    try {
	        em.getTransaction().begin();
	        T managed = em.contains(entity) ? entity : em.merge(entity);
	        em.remove(managed);
	        em.getTransaction().commit();
	    } catch (Exception e) {
	        if (em.getTransaction().isActive()) {
	            em.getTransaction().rollback();
	        }
	        throw new DAOException("Error deleting entity", e);
	    } finally {
	        em.close();
	    }
	}

}
