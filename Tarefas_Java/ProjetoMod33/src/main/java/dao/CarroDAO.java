package dao;

import domain.Carro;
import domain.Marca;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class CarroDAO {

	public void cadastrar(Carro carro) {
		EntityManagerFactory entityMenagerFactory =
				Persistence.createEntityManagerFactory("TarefaMod33");
		EntityManager entityManager = entityMenagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(carro);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityMenagerFactory.close();
		
		System.out.println("Carro cadastrado com sucesso.");
		
	}
	
	public Carro buscarPorNomeMarca(String nomeMarca) {
		EntityManagerFactory entityMenagerFactory =
				Persistence.createEntityManagerFactory("TarefaMod33");
		EntityManager entityManager = entityMenagerFactory.createEntityManager();
		
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT c from Carro c " );
		sb.append("INNER JOIN c.marca m ");
		sb.append("WHERE m.nome = :nomeMarca");

		entityManager.getTransaction().begin();
		TypedQuery<Carro> query =
				entityManager.createQuery(sb.toString(), Carro.class);
		query.setParameter("nomeMarca", nomeMarca);
		Carro carro = query.getSingleResult();
		
		entityManager.close();
		entityMenagerFactory.close();
		
		return carro;
	}

}
