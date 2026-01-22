package com.dataarcanjo;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import dao.IProdutoDAO;
import dao.ProdutoDAO;
import domain.Produto;

public class MainTest {
	
	private IProdutoDAO produtoDAO;
	
	@Test
	public void cadastarTest() {
	
		produtoDAO = new ProdutoDAO();
		
		Produto produto = new Produto("Joystick PRO", 360.00);
		produtoDAO.cadastrar(produto);
		
		System.out.println(produto.toString());
		
		assertNotNull(produto);
		assertNotNull(produtoDAO.searchAll());
		
		
	}
}
