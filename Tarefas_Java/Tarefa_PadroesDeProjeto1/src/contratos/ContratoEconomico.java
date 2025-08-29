package contratos;

import construtoresApto.*;
import construtoresMobilia.*;

public class ContratoEconomico implements ContratoBase {

	@Override
	public void listarContrato() {
		AptoC apto = new AptoC();
		MobiliaBasica mobilia = new MobiliaBasica();
		
		apto.aptoLayout();
		mobilia.listarMobilia();
		
		System.out.println("\nPreço para compra: R$ " + (apto.getCusto() + mobilia.getCusto())*1.5 +
				"\nPreço para aluguel: R$ 2000\n" );
	}

}
