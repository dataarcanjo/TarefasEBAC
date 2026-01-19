package br.com.dataarcanjo.dao;

import java.util.List;
import br.com.dataarcanjo.domain.Produto;

public interface IProdutoDao {
	
	Produto cadastrar(Produto prod);
	
	Produto buscarPorNome(Produto curso);
	
	Produto resgatarVendas(Long qtd);
	
	List<Produto> buscarTodos();
	
	void excluir(Produto prod);

}
