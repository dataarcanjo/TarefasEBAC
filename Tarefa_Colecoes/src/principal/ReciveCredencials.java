package principal;
import java.util.*;

public class ReciveCredencials {

	public static void main(String[] args) {
		NameList();
		NameGenderList();
		
		
	}
	
	private static void NameList() {
		Scanner sc = new Scanner(System.in);
		List <String> names = new ArrayList<>();
		
		System.out.println("Enter a comma-separated list of names: ");
		String input = sc.nextLine();
		
		String[] separator = input.split(",");
		
		for (String s : separator) {
			names.add(s.trim());			
		}
		
		Collections.sort(names);
		System.out.println("******  List of names  ******\n");
		System.out.println(names);
	}

	private static void NameGenderList() {
		String[] separatorNames;
		Scanner sc = new Scanner(System.in);
		List<Student> students = new ArrayList<>();
		
		System.out.println("Enter a comma-separated list of names and genders");
		System.out.println("Following this format: name-g,");
		String input = sc.nextLine();
		
		separatorNames = input.split(",");
		
		for (String student : separatorNames) {
			String[] separatorSex = student.split("-");
			
			String x = separatorSex[0].trim();
			separatorSex[1] = separatorSex[1].trim();
			char y = Character.toLowerCase(separatorSex[1].charAt(0));
			
			Student a = new Student(x, y);
			students.add(a);
		}
		System.out.println("******  Female list  ******\n");
		
		for (Student s : students) {
			if (s.getSex() == 'f') {
				System.out.println("- " + s.getName());
			}
		}
		System.out.println("\n******  Male list  ******\n");
		
		for (Student s : students) {
			if (s.getSex() == 'm') {
				System.out.println("- " + s.getName());
			}
		}	
	}
}
