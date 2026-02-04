package domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_ACESSORIOS_33")
public class Acessorio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "acessorio_seq")
	@SequenceGenerator(name = "acessorio_seq", sequenceName = "sq_acessorio",
		initialValue = 1, allocationSize = 1)
	private Long id;
	
	@Column(name = "NOME", length = 50, nullable = false)
	private String nome;
	
	@ManyToOne
	@JoinColumn(name = "id_carro_fk",
		foreignKey = @ForeignKey(name = "fk_carro_acessorio"),
		referencedColumnName = "id", nullable = false)
	private Carro carro;
	
	@ManyToOne
	@JoinColumn(name = "id_marca_fk",
			foreignKey = @ForeignKey(name = "fk_marca_acessorio"),
			referencedColumnName = "id", nullable = false)
	private Marca marca;

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
	 * @return the carro
	 */
	public Carro getCarro() {
		return carro;
	}

	/**
	 * @param carro the carro to set
	 */
	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	/**
	 * @return the marca
	 */
	public Marca getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
}
