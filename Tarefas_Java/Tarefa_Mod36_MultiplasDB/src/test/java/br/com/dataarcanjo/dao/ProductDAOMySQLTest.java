package br.com.dataarcanjo.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.io.Serializable;
import java.math.BigDecimal;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import br.com.dataarcanjo.domain.Product;
import br.com.dataarcanjo.exceptions.DAOException;
import jakarta.persistence.EntityManager;

public class ProductDAOMySQLTest {
	
	private GenericDAO<Product, Long> dao;
	
	@Before
	public void TestsSetUp() {
		dao = new ProductDAO();
	}
	
	
	// Limpando banco de dados para cada teste
	@After
	public void finishTest() {
		
		EntityManager em = PostgresConnectionFactory.getEntityManager();
		
		
		try {
			em.getTransaction().begin();
			
			em.createNativeQuery("TRUNCATE TABLE tb_products").executeUpdate();
			
			em.getTransaction().commit();
			
		} catch (Exception e) {
			em.getTransaction().rollback();
			throw new DAOException("Error truncating table 'tb_products': ", e);
		} finally {
			em.close();
		}
		
		EntityManager emMySQL = MySQLConnectionFactory.getEntityManager();
		try {
			emMySQL.getTransaction().begin();
			
			emMySQL.createNativeQuery("TRUNCATE TABLE tb_products").executeUpdate();
			
			emMySQL.getTransaction().commit();
			
		} catch (Exception e) {
			emMySQL.getTransaction().rollback();
			throw new DAOException("Error truncating table 'tb_products': ", e);
		} finally {
			emMySQL.close();
		}
	}
	
	
	
	@Test
	public void saveAndFindByIdTest() throws DAOException {
		Product product = mockProd();

        dao.save(product);

        Product saved = dao.findById(product.getId());

        assertEquals(product.getName(), saved.getName());
        assertEquals(product.getPrice(), saved.getPrice());
        assertEquals(product.getCategory(), saved.getCategory());
        assertEquals(product.getStock(), saved.getStock());
    }
	@Test
	public void updateTest() throws DAOException {
		Product product = mockProd();
		dao.save(product);
		
		product.setName("Basic shirt");
		product.setPrice(BigDecimal.valueOf(29.99));
		
		dao.update(product);
		
		Product saved = dao.findById(product.getId());

        assertEquals(product.getName(), saved.getName());
        assertEquals(product.getPrice(), saved.getPrice());
        assertEquals(product.getCategory(), saved.getCategory());
        assertEquals(product.getStock(), saved.getStock());
	}
	@Test
	public void deleteTest() throws DAOException {
		Product product = mockProd();
		dao.save(product);
		
		dao.delete(product);

	    Product deleted = dao.findById(product.getId());

	    assertNull(deleted);
	}
	
	
	private Product mockProd() {
		Product pmock = new Product();
		
		pmock.setName("T-shirt");
		pmock.setPrice(BigDecimal.valueOf(35.99));
		pmock.setCategory("Clothing");
        pmock.setStock(3);
        
        return pmock;
	}
	
	@Test
	public void saveAndFindByIdMySQL() {
		
	}
	
}
