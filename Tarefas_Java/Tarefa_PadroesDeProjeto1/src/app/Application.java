package app;

import contratos.*;

public class Application {

	public static void main(String[] args) {
		ContratoBase contratoEconomico = new ContratoEconomico();
		ContratoBase contratoPremium = new ContratoPremium();

		contratoPremium.listarContrato();
		
		contratoEconomico.listarContrato();
	}

}
