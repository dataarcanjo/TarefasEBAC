package br.com.dataarcanjo.dao;

import br.com.dataarcanjo.domain.Product;
import br.com.dataarcanjo.exceptions.DAOException;
import jakarta.persistence.EntityManager;

public class ProductDAO implements GenericDAO<Product, Long> {

    private Class<Product> entityClass = Product.class;

    public void save(Product entity) {
        EntityManager em = PostgresConnectionFactory.getEntityManager();
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

    public Product findById(Long id) {
        EntityManager em = PostgresConnectionFactory.getEntityManager();
        try {
            return em.find(entityClass, id);
        } catch (Exception e) {
            throw new DAOException("Error during search (RunTime): ", e);
        } finally {
            em.close();
        }
    }

    public void update(Product entity) {
        EntityManager em = PostgresConnectionFactory.getEntityManager();
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

    public void delete(Product entity) {
        EntityManager em = PostgresConnectionFactory.getEntityManager();
        try {
            em.getTransaction().begin();
            Product managed = em.contains(entity) ? entity : em.merge(entity);
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