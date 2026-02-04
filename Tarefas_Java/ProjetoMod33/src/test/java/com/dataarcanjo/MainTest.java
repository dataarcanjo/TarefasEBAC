package com.dataarcanjo;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import dao.IProdutoDAO;
import dao.ProdutoDAO;
import domain.Produto;

public class MainTest {
	
//	Criar 3 entidades (Carro, Marca, Acessório);
//	Modelar as 3 entidades (OneToOne, ManyToOne e OneToMany);
//	Verificar se está ligado ao DB;
	
	
	
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
