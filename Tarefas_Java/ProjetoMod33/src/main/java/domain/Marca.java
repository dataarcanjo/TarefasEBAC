package domain;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_MARCAS_33")
public class Marca {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "marca_seq")
	@SequenceGenerator(name = "marca_seq", sequenceName = "sq_marca",
		initialValue = 1, allocationSize = 1)
	private Long id;
	
	@Column(name = "NOME", length = 50, nullable = false)
	private String nome;
	
	@OneToMany(mappedBy = "marca")
	private List<Carro> carro;
	
	@OneToMany(mappedBy = "marca")
	private List<Acessorio> acess;


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
	public List<Carro> getCarro() {
		return carro;
	}

	/**
	 * @param carro the carro to set
	 */
	public void setCarro(List<Carro> carro) {
		this.carro = carro;
	}

	/**
	 * @return the acess
	 */
	public List<Acessorio> getAcess() {
		return acess;
	}

	/**
	 * @param acess the acess to set
	 */
	public void setAcess(List<Acessorio> acess) {
		this.acess = acess;
	}

	
}
