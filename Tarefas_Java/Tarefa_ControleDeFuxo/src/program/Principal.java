package program;
import java.util.*;

public class Principal {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 Student s1 = new Student();
		 double[] num = new double[4];
		 
		 System.out.print("Write the student's name: ");
		 String txt = scan.nextLine();
		 
		 s1.setName(txt);
		 
		 System.out.print("\n\nWrite the student's grade\n");
		 
		 for (int i = 0; i < 4 ; i++) {
			 
			 	System.out.println("Grade " + (i + 1) + ": ");
				num[i] = scan.nextDouble();
							
				
				s1.setMedia(s1.getMedia() + num[i]);
				System.out.println("A média está: " + s1.getMedia());
			}
		 
		 s1.setMedia(s1.getMedia()/4);
		 
		 if (s1.getMedia() >= 7) {
			 System.out.println(s1.getName() + " is approved!");
		 	}
		 else if (s1.getMedia() < 7 && s1.getMedia() >= 5) {
			 System.out.println(s1.getName() + " is not approved.");
		 	}
		 else if (s1.getMedia() < 5) {
			 System.out.println(s1.getName() + " failed on this grade.");
		 	}
		 else {
			 System.out.println("There's a calculation error in the student's grade.");
		 }
	}

}
