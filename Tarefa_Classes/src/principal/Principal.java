/**
 * @author Rafael Arcanjo
 */
package principal;

public class Principal {

	public static void main(String[] args) {
		
		Player player = new Player();
		
		System.out.println("Olá jogador(a)! Escreva o nome do seu personagem: ");
		player.setName("Cleitão, o Bárbaro");
		
		System.out.println("\nBelo nome! " + player.getName() + "\n\nAgora escolha sua classe: ");
		player.setClasse("Mago");
		
		System.out.println("\nBoa escolha um(a) " + player.getClasse());

	}

}
