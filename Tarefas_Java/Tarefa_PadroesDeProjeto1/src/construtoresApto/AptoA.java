package construtoresApto;

public class AptoA implements BuilderApto{

	@Override
	public void aptoLayout() {
		System.out.println("\n********** Layout do apartamento **********\n" + 
				"- Área: 120 m²\n" + 
				"- Banheiros: 4" +
				"- Quartos: 2 Com closet e banheiro privativo / 1 Apenas com banheiro");
	}

	@Override
	public byte getCusto() {
		return (byte) 465000;
	}
	
}
