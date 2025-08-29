package br.com.rpires.dao;

import java.util.List;

public interface IClienteDAO {

	public Integer cadastrar(Cliente cliente) throws Exception ;
	
	public Cliente consultarCodigo(String codigo) throws Exception; 
	
	public Integer excluir(Cliente cliente) throws Exception;
	
	public Integer atualizar(Cliente cliente, String codigo) throws Exception;
	
	public List<Cliente> buscarTodos() throws Exception;
}
