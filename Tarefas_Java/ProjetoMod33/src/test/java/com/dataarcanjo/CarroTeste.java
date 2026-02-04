package com.dataarcanjo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import dao.CarroDAO;
import dao.IProdutoDAO;
import dao.MarcaDAO;
import dao.ProdutoDAO;
import domain.Carro;
import domain.Marca;
import domain.Produto;

public class CarroTeste {
	
//	Criar 3 entidades (Carro, Marca, Acessório);
//	Modelar as 3 entidades (OneToOne, ManyToOne e OneToMany);
//	Verificar se está ligado ao DB;
	
	
	
	CarroDAO carroDAO = new CarroDAO();
	MarcaDAO marcaDAO = new MarcaDAO();
	
	@Test
	public void cadastarTest() {
		
		Marca marca = new Marca();
		marca.setNome("Honda");
		
		
		Carro carro = new Carro();
		carro.setNome("Carro teste1");
		carro.setModelo("0AX2010");
		carro.setMarca(marca);
		
		List<Carro> lista = new ArrayList<Carro>();
		lista.add(carro);
		
		marca.setCarro(lista);
		carro.setMarca(marca);
		
		marcaDAO.cadastrar(marca);
		carroDAO.cadastrar(carro);
		
		
		System.out.println("Ok");
		
		assertNotNull(carro);
		assertNotNull(carroDAO.buscarPorNomeMarca(marca.getNome()));
		
	}
}
