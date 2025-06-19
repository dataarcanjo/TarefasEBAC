package builder;

import peças.Chassi;
import peças.Motor;

public interface Builder {
	void setNome(String nome);
	void setChassi(Chassi chassi);
	void setMotor(Motor motor);
	void setCusto(double custo);
}
