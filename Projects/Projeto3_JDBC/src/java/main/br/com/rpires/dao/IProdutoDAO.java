package br.com.rpires.dao;

import java.util.List;

public interface IProdutoDAO {
	
	public Integer cadastrar(Produto produto) throws Exception ;
	
	public Produto consultar(Long id) throws Exception; 
	
	public Integer excluir(Long id) throws Exception;
	
	public Integer atualizar(Produto produto, Long id) throws Exception;
	
	public List<Produto> buscarTodos() throws Exception;
}
