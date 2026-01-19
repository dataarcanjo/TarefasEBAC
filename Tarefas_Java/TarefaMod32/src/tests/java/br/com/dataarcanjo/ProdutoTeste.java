package br.com.dataarcanjo;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.dataarcanjo.dao.*;
import br.com.dataarcanjo.domain.*;

public class ProdutoTeste {

	private IProdutoDao produtoDao;
		
	
	public ProdutoTeste() {
		produtoDao = new ProdutoDAO();
	}
		
	
	@Test
	public void cadastrar() {
		Produto prod = new Produto();
		prod.setNome("Pizza de calabresa");
		prod.setVendas(30l);
		prod = produtoDao.cadastrar(prod);
			
		assertNotNull(prod);
		assertNotNull(prod.getId());
	}

}
