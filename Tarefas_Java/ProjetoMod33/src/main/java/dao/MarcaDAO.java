package dao;

import domain.Carro;
import domain.Marca;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class MarcaDAO {

	public void cadastrar(Marca marca) {
		EntityManagerFactory entityMenagerFactory =
				Persistence.createEntityManagerFactory("TarefaMod33");
		EntityManager entityManager = entityMenagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(marca);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityMenagerFactory.close();
		
		System.out.println("Marca cadastrada com sucesso.");
		
	}
	

}
