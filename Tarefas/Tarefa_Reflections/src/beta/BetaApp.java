package beta;



public class BetaApp {
	
	public static void main(String[] args) {
		
		Class<?> classe = TabelaDefault.class;
		System.out.println(classe + "\n************\n");
		
		System.out.println(classe.getAnnotation(Tabela.class).nome());
	}

}
