/**
 * 
 */
package br.com.rpires;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import br.com.rpires.dao.*;

/**
 * @author rodrigo.pires
 *
 */
public class ClienteTest {

	@Test
	public void crudeClienteTest() throws Exception {
		IClienteDAO dao = new ClienteDAO();
		
		Cliente cliente = new Cliente();
		cliente.setCodigo("01");
		cliente.setNome("Rodrigo Pires");
		
		Integer qtd = dao.cadastrar(cliente);
		assertTrue(qtd == 1);
		
		Cliente clienteBD = dao.consultarCodigo(cliente.getCodigo());
		assertNotNull(clienteBD);
		assertNotNull(clienteBD.getId());
		assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
		assertEquals(cliente.getNome(), clienteBD.getNome());
		
		cliente.setNome("Rafael Arcanjo");
		cliente.setCodigo("02");
		qtd = dao.atualizar(cliente, clienteBD.getCodigo());
		assertTrue(qtd == 1);
		
		clienteBD = dao.consultarCodigo(cliente.getCodigo());
		
		cliente.setCodigo("01");
		cliente.setNome("Alana Barrosa");
		dao.cadastrar(cliente);
		
		List<Cliente> lista = dao.buscarTodos();
		assertTrue(!lista.isEmpty());
		
		System.out.println(lista.size());
		
		for (Cliente c : lista) {
			System.out.println(" | " + c.getId() + " | " + c.getNome() + " | " + c.getCodigo());
			assertTrue(c.getCodigo().equals(cliente.getCodigo()) || c.getCodigo().equals(clienteBD.getCodigo()));
			assertTrue(c.getNome().equals(cliente.getNome()) || c.getNome().equals(clienteBD.getNome()));
			Integer qtdDel = dao.excluir(c);
			assertNotNull(qtdDel);
		}
	}
}
