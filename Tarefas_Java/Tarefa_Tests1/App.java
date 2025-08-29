package beta;

import java.util.*;
import java.util.stream.Stream;

import objects.*;


public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<User> users = new ArrayList<>();
		
		for (boolean i = true; i;) {
			System.out.print("Type the user's name: ");
			String name = sc.nextLine();
					
			System.out.print("\nType the user's sex [m] or [f]: ");
			char sex = sc.nextLine().charAt(0);
			sex = Character.toUpperCase(sex);
			
			while (sex != 'M' && sex != 'F') {
				System.out.print("\nInvalid sex. Type [m] or [f]: ");
				sex = sc.nextLine().charAt(0);
				sex = Character.toUpperCase(sex);
			}
			
			users.add(new User(name, sex));
			
			System.out.println("\nType [1] to add one more user or [2] to continue: ");
			byte command = sc.nextByte();
			sc.nextLine(); // limpa o buffer
			
			while (command != 1 && command != 2) {
				System.out.print("\nInvalid command. Type [1] to add more user or [2] to continue: ");
				command = sc.nextByte();
				sc.nextLine(); // limpa o buffer
			}
			
			if (command == 2) {
				i = false;
			}
		}
		System.out.println("\n********* Women's list *********\n");
		
		users.stream()
			.filter(user -> user.getSex() == 'F')
			.forEach(user -> System.out.println("- " + user.getName()));
		
	}

}
