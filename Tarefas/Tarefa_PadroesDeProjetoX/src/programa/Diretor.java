package programa;

import builder.Builder;
import peças.*;

public class Diretor {
	
	public void contruaFerrari(Builder builder) {
		builder.setNome("Ferrari");
		builder.setChassi(new Chassi("Sport2020", "Vermelha", "TouchColor 5.0", 5));
		builder.setMotor(new Motor("V11",3000,"Fibra de carbono", true));
		builder.setCusto(800000);
	}
	
	public void contruaChevete(Builder builder) {
		builder.setNome("Chevete");
		builder.setChassi(new Chassi("Basic2006", "Rosa", "Funcional", 5));
		builder.setMotor(new Motor("V0",0.5,"Restos oxidados", false));
		builder.setCusto(50000);
	}
	
	public void contruaNave(Builder builder) {
		builder.setNome("Yamaha");
		builder.setChassi(new Chassi("", "Azul Metálico", "Eletronic 136", 1));
		builder.setMotor(new Motor("VM3.5",1800,"", false));
		builder.setCusto(21000);
	}
}
