package construtoresApto;

public class AptoC implements BuilderApto{

	@Override
	public void aptoLayout() {
		System.out.println("\n********** Layout do apartamento **********\n" + 
				"- Área: 42 m²\n" + 
				"- Banheiros: 1" +
				"- Quartos: 2");
	}
	@Override
	public byte getCusto() {
		return (byte) 210000;
	}
}
