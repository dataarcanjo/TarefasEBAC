package program;
import java.util.*;

public class Principal {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 Student s1 = new Student();
		 double[] num = new double[3];
		 
		 System.out.print("Write the student's name: ");
		 String txt = scan.nextLine();
		 
		 s1.setName(txt);
		 
		 System.out.print("\n\nWrite the student's scores\n");
		 
		 for (int i = 0; i < 3 ; i++) {
				System.out.println("Score " + (i + 1) + ": ");
				num[i] = scan.nextDouble();
			}
		 
		 s1.setMedia(
				 (num[0] + num[1] + num[2])/3);
		 
		 System.out.print("\n"+ s1.getName() + "'s medium score is: " + s1.getMedia());

	}

}
