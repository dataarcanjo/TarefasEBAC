package peças;

public class Motor {
	private String modelo;
	private double potencia;
	private String material;
	private boolean eletrico;
	
	public Motor(String nome, double potencia, String material, boolean eletrico) {
		this.modelo = nome;
		this.potencia = potencia;
		this.material = material;
		this.eletrico = eletrico;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String nome) {
		this.modelo = nome;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public boolean isEletrico() {
		return eletrico;
	}

	public void setEletrico(boolean eletrico) {
		this.eletrico = eletrico;
	}
	
}
