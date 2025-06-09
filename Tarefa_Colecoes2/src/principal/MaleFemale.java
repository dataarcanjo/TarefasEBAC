package principal;

import java.util.*;


public class MaleFemale {

	public static void main(String[] args) {
		String[] sUsers;
		Scanner sc = new Scanner(System.in);
		Map<String, Character> mapUsers = new TreeMap<>();
		
		System.out.println("Enter a comma-separated list of names and genders");
		System.out.println("Following this format: name-g,");
		String input = sc.nextLine();
		
		sUsers = input.split(",");
		
		for (String userG : sUsers) {
			userG = userG.trim();
			String separator[] = userG.split("-");
			separator[1] = separator[1].trim();
			separator[1] = separator[1].toUpperCase();
			
			mapUsers.put(separator[0].trim(),separator[1].charAt(0));	
		}
		
		System.out.println(mapUsers + "\n\n");
		
		System.out.println("**** Woman's list: ****");
		for (Map.Entry<String, Character> e : mapUsers.entrySet()) {
		    if (e.getValue() == 'F') {
		        System.out.println(" - " + e.getKey());
		    }
		}

		System.out.println("\n**** Man's List: ****");
		for (Map.Entry<String, Character> e : mapUsers.entrySet()) {
		    if (e.getValue() == 'M') {
		        System.out.println(" - " + e.getKey());
		    }
		}

	}

}
