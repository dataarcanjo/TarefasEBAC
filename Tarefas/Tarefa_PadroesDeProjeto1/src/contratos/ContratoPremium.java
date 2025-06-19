package contratos;

import construtoresApto.*;
import construtoresMobilia.*;

public class ContratoPremium implements ContratoBase {

	@Override
	public void listarContrato() {
		BuilderApto apto = new AptoA();
		BuilderMobilia mobilia = new MobiliaCompleta();
		
		apto.aptoLayout();
		mobilia.listarMobilia();
		
		System.out.println("Preço para compra: R$ " + (apto.getCusto() + mobilia.getCusto())*1.5 +
				"\nPreço para aluguel: R$ 5340\n" );
	}

}
