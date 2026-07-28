package br.com.dataarcanjo.dao;

import br.com.dataarcanjo.exceptions.DAOException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/*
 * Classe singleton que inicializa a conexão com banco de dados para gerar EntityManager postgres
 */
public class PostgresConnectionFactory {
	
	private static final EntityManagerFactory factory;
	
	static {
		try {
			factory = Persistence.createEntityManagerFactory("PostgresDB");
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
