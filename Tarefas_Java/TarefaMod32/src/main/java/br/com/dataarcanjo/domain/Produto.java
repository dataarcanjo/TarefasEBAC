package br.com.dataarcanjo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PRODUTOS")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto_seq")
	@SequenceGenerator(name = "produto_seq", sequenceName = "sq_cliente", initialValue = 1, allocationSize = 1)
	private Long id;
	
	@Column(name = "NOME", length = 50, nullable = false, unique = false)
	private String nome;
	
	@Column(name = "VENDAS")
	private Long vendas;

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
	 * @return the vendas
	 */
	public Long getVendas() {
		return vendas;
	}

	/**
	 * @param vendas the vendas to set
	 */
	public void setVendas(Long vendas) {
		this.vendas = vendas;
	}

}
