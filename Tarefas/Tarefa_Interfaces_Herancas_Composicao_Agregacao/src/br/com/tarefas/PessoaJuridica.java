package br.com.tarefas;

public class PessoaJuridica extends Pessoa {

	String razaoSocial, naturezaJurídica, endereço;
	Double capitalSocial;
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getNaturezaJurídica() {
		return naturezaJurídica;
	}
	public void setNaturezaJurídica(String naturezaJurídica) {
		this.naturezaJurídica = naturezaJurídica;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public Double getCapitalSocial() {
		return capitalSocial;
	}
	public void setCapitalSocial(Double capitalSocial) {
		this.capitalSocial = capitalSocial;
	}
	
	
}
