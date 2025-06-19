package automoveis;

import peças.Chassi;
import peças.Motor;

public class Carro {

	private final String nome;
	private final Chassi chassi;
	private final Motor motor;
	private final double custo;
	
	public Carro(String nome, Chassi chassi, Motor motor, double custo) {
		this.nome = nome;
		this.chassi = chassi;
		this.motor = motor;
		this.custo = custo;
	}

	public String getNome() {
		return nome;
	}

	public Chassi getChassi() {
		return chassi;
	}

	public Motor getMotor() {
		return motor;
	}

	public double getCusto() {
		return custo;
	}
	
	public String print() {
        String info = "";
        info += "Nome do carro: " + nome + "\n";
        info += "Motor: Potância - " + motor.getPotencia() + "; modelo - " + motor.getModelo() + "\n";
        info += "Chassi: "+ chassi.getModelo() + "\n";
        info += "Preço do carro: R$"+ custo + "\n";
        return info;
	}
}
