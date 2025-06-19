package construtoresMobilia;

public class MobiliaCompleta implements BuilderMobilia{

	@Override
	public void listarMobilia() {
		System.out.println("\n********** Móveis Inclusos **********\n" + 
							"- Sofá\n" + 
							"- Cama\n" +
							"- Geladeira\n" +
							"- Cama\n" +
							"- Microondas\n" +
							"- Ar-condicionado\n" + 
							"- Televisão\n");
	}

	@Override
	public byte getCusto() {
		return (byte) 11290;
	}

}
