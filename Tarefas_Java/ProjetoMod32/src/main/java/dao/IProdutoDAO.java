package dao;

import java.util.List;

import domain.Produto;

public interface IProdutoDAO {
	
	public void cadastrar(Produto prod);
	
	public Produto searchName(String name);
	
	public Produto excluirId(Integer id);
	
	public List<Produto> searchAll();

}
