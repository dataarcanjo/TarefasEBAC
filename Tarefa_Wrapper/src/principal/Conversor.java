package principal;
import java.util.*;

public class Conversor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva um número: ");
		long num = sc.nextLong();
		
		String num1 = String.valueOf(num);
		System.out.print("\nSeu número foi: " + num1);

	}

}
