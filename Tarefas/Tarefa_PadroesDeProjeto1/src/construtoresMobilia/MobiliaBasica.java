package construtoresMobilia;

public class MobiliaBasica implements BuilderMobilia{

	@Override
	public void listarMobilia() {
		System.out.println("\n********** Móveis Inclusos **********\n" + 
							"- Sofá\n" + 
							"- Cama\n" +
							"- Geladeira\n" +
							"- Cama\n");
	}

	@Override
	public byte getCusto() {
		return (byte) 7800;
	}

}
