package br.com.dataarcanjo.dao;

import br.com.dataarcanjo.exceptions.DAOException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/*
 * Classe singleton que inicializa a conexão com banco de dados para gerar EntityManager
 */
public class ConnectionFactory {
	
	private static final EntityManagerFactory factory;
	
	static {
		try {
			factory = Persistence.createEntityManagerFactory("Projeto4");
		} catch (Exception e){
			throw new DAOException("Error initializing ConnectionFactory: ", e);
		}
	}

    public static EntityManager getEntityManager() {
        return factory.createEntityManager();
    }

    public static void closeFactory() {
        if (factory.isOpen()) {
        	factory.close();
        }
    }
}
