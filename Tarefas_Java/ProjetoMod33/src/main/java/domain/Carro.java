package domain;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_CARROS_33")
public class Carro {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "carro_seq")
	@SequenceGenerator(name = "carro_seq", sequenceName = "sq_carro",
		initialValue = 1, allocationSize = 1)
	private Long id;
	
	@Column(name = "NOME", length = 50)
	private String nome;
	
	@Column(name = "MODELO", length = 50, nullable = false)
	private String modelo;
	
	@ManyToOne
	@JoinColumn(name = "id_marca_fk",
			foreignKey = @ForeignKey(name = "fk_marca_carro"),
			referencedColumnName = "id", nullable = false)
	private Marca marca;
	
	@OneToMany(mappedBy = "carro")
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
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
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

	@Override
	public int hashCode() {
		return Objects.hash(acess, id, marca, modelo, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		return Objects.equals(acess, other.acess) && Objects.equals(id, other.id) && Objects.equals(marca, other.marca)
				&& Objects.equals(modelo, other.modelo) && Objects.equals(nome, other.nome);
	}

	
}
