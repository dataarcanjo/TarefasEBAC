package peças;

public class Chassi {
	private String modelo;
	private String cor;
	private String painel;
	private int assentos;
	
	public Chassi(String modelo, String cor, String painel, int assentos) {
		this.modelo = modelo;
		this.cor = cor;
		this.painel = painel;
		this.assentos = assentos;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPainel() {
		return painel;
	}

	public void setPainel(String painel) {
		this.painel = painel;
	}

	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(byte assentos) {
		this.assentos = assentos;
	}
	
	
}
