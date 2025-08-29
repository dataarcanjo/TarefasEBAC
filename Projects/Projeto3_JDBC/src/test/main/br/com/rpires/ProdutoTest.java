package br.com.rpires;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.com.rpires.dao.IProdutoDAO;
import br.com.rpires.dao.Produto;
import br.com.rpires.dao.ProdutoDAO;
import br.com.rpires.dao.jdbc.ConnectionFactory;

public class ProdutoTest {
	@Test
	public void crudeProdutoTest() throws Exception {
		IProdutoDAO dao = new ProdutoDAO();
		
		// REINICIANDO BANCO DE TESTES
		Connection connection = null;
		PreparedStatement stm = null;
		
		try {
			connection = ConnectionFactory.getConnection();
			String sql = "truncate tb_produtos; ALTER SEQUENCE sq_produtos RESTART WITH 1;";
			stm = connection.prepareStatement(sql);
			
			stm.executeUpdate();
		} catch(Exception e) {
			throw e;
		} finally {
			if (stm != null && !stm.isClosed()) {
				stm.close();
			}
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		}
		
		// CADASTRO
		Produto produto1 = new Produto();
		produto1.setCodigo("01");
		produto1.setNome("Roda");
		produto1.setCusto(102.70);
		Integer qtd = dao.cadastrar(produto1);
		assertTrue(qtd == 1);
		
		Produto produto2 = new Produto();
		produto2.setCodigo("01");
		produto2.setNome("Assento");
		produto2.setCusto(497.);
		qtd = dao.cadastrar(produto2);
		assertTrue(qtd == 1);
		
		Produto produto3 = new Produto();
		produto3.setCodigo("03");
		produto3.setNome("Chassi");
		produto3.setCusto(3293.999);
		qtd = dao.cadastrar(produto3);
		assertTrue(qtd == 1);
		
		//CONSULTA
		Produto produtoDB = dao.consultar(1l);
		assertNotNull(produtoDB);
		assertTrue(produtoDB.getId() == 1l);
		assertEquals(produto1.getCodigo(), produtoDB.getCodigo());
		assertEquals(produto1.getNome(), produtoDB.getNome());
		assertEquals(produto1.getCusto(), produtoDB.getCusto());
		
		//ATUALIZAÇÃO
		produto1.setNome("Roda aro 90");
		produto1.setCodigo("02");
		produto1.setCusto(330.54);
		qtd = dao.atualizar(produto1, produtoDB.getId());
		assertTrue(qtd == 1);
		
		produtoDB = dao.consultar(1l);
		assertTrue(produtoDB.getId() == 1l);
		assertEquals(produto1.getCodigo(), produtoDB.getCodigo());
		assertEquals(produto1.getNome(), produtoDB.getNome());
		assertEquals(produto1.getCusto(), produtoDB.getCusto());
		
		//LISTAR E EXCLUIR
		List<Produto> listaBD = dao.buscarTodos();
		assertTrue(!listaBD.isEmpty());
		
		System.out.println(listaBD.size());
		
		for (Produto c : listaBD) {
			System.out.println(" | " + c.getId() + " | " + c.getNome() + " | " + c.getCodigo() + " | " + c.getCusto());
			
			assertTrue(c.getNome().equals("Roda aro 90") || c.getNome().equals("Chassi") || c.getNome().equals("Assento"));
			assertTrue(c.getCodigo().equals("01") || c.getCodigo().equals("02") || c.getCodigo().equals("03"));
			assertTrue(c.getCusto() == 330.54 || c.getCusto() == 497. || c.getCusto() == 3294);
			
			qtd = dao.excluir(c.getId());
			assertTrue(qtd == 1);
			
		}
	}
}
