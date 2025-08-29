package br.com.rpires.dao;

public class Produto {
	private Long id;
	
	private String codigo;
	
	private String nome;
	
	private Double custo;
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the custo
	 */
	public Double getCusto() {
		return custo;
	}

	/**
	 * @param custo the custo to set
	 */
	public void setCusto(Double custo) {
		this.custo = custo;
	}
	
}
