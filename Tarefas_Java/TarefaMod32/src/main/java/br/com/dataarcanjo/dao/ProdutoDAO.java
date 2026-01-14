package br.com.dataarcanjo.dao;

import java.util.List;

import br.com.dataarcanjo.domain.Produto;
import jakarta.persistence.*;

public class ProdutoDAO implements IProdutoDao {

	@Override
	public Produto cadastrar(Produto prod) {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("TarefaMod32");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(prod);
		entityManager.getTransaction().commit();
		 
		entityManager.close();
		entityManagerFactory.close();
		return prod;
	}

	@Override
	public Produto buscarPorNome(Produto prod) {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("TarefaMod32");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		TypedQuery<Produto> query = entityManager.createQuery(
	            "SELECT p FROM Produto p WHERE p.nome = :nome", Produto.class);
	    query.setParameter("nome", prod.getNome());

	    Produto produto = query.getSingleResult();

	    entityManager.close();
	    entityManagerFactory.close();

	    return produto;
	}

	@Override
	public Produto resgatarVendas(Long qtd) {
	    EntityManagerFactory entityManagerFactory =
	            Persistence.createEntityManagerFactory("TarefaMod32");
	    EntityManager entityManager = entityManagerFactory.createEntityManager();

	    TypedQuery<Produto> query = entityManager.createQuery(
	            "SELECT p FROM Produto p WHERE p.vendas = :qtd", Produto.class);
	    query.setParameter("qtd", qtd);

	    Produto produto = query.getSingleResult();

	    entityManager.close();
	    entityManagerFactory.close();

	    return produto;
	}

	@Override
	public List<Produto> buscarTodos() {
	    EntityManagerFactory entityManagerFactory =
	            Persistence.createEntityManagerFactory("TarefaMod32");
	    EntityManager entityManager = entityManagerFactory.createEntityManager();

	    TypedQuery<Produto> query =
	            entityManager.createQuery("SELECT p FROM Produto p", Produto.class);

	    List<Produto> lista = query.getResultList();

	    entityManager.close();
	    entityManagerFactory.close();

	    return lista;
	}

	@Override
	public void excluir(Produto prod) {
	    EntityManagerFactory entityManagerFactory =
	            Persistence.createEntityManagerFactory("TarefaMod32");
	    EntityManager entityManager = entityManagerFactory.createEntityManager();

	    entityManager.getTransaction().begin();

	    Produto produtoGerenciado = entityManager.merge(prod);
	    entityManager.remove(produtoGerenciado);

	    entityManager.getTransaction().commit();

	    entityManager.close();
	    entityManagerFactory.close();
	}

}
