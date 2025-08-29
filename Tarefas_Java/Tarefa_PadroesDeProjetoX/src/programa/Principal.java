package programa;

import automoveis.*;
import builder.*;

public class Principal {

	public static void main(String[] args) {
		Diretor rafael = new Diretor();
		
		CarroBuilder construtorCarro = new CarroBuilder();
		
		rafael.contruaFerrari(construtorCarro);
		
		Carro carro = construtorCarro.getResult();
		
		System.out.println("Você fez um carro " + carro.getNome() + "\n ele custou: " + carro.getCusto());
	}

}
