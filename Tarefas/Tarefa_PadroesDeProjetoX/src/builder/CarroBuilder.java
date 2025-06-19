package builder;

import automoveis.Carro;
import peças.Chassi;
import peças.Motor;

public class CarroBuilder implements Builder{
	private String nome;
	private Chassi chassi;
	private Motor motor;
	private double custo;
	
	
	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public void setChassi(Chassi chassi) {
		this.chassi = chassi;
	}

	@Override
	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	@Override
	public void setCusto(double custo) {
		this.custo = custo;
	}
	
	public Carro getResult() {
		return new Carro(nome, chassi, motor, custo);
	}
}
