package builder;

import automoveis.Moto;
import peças.Chassi;
import peças.Motor;

public class MotoBuilder implements Builder{
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
	public Moto getResult() {
		return new Moto(nome, chassi, motor, custo);
	}
}
