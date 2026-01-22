package dao;

import java.util.List;

import domain.Produto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ProdutoDAO implements IProdutoDAO {

	@Override
	public void cadastrar(Produto prod) {
		EntityManagerFactory entityMenagerFactory =
				Persistence.createEntityManagerFactory("TarefaMod32");
		EntityManager entityManager = entityMenagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(prod);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityMenagerFactory.close();
		
		System.out.println("Produto cadastrado com sucesso.");

	}

	@Override
	public Produto searchName(String name) {
		EntityManagerFactory entityMenagerFactory =
				Persistence.createEntityManagerFactory("TarefaMod32");
		EntityManager entityManager = entityMenagerFactory.createEntityManager();
		
		
		return null;
	}

	@Override
	public Produto excluirId(Integer id) {
		
		return null;
	}

	@Override
	public List<Produto> searchAll() {
		
		return null;
	}

}
