import java.util.Scanner;

public class Ola {
    public static void main(String[] args) {
        
        System.out.println("Olá, Mundo");

        Scanner s = new Scanner(System.in);

        System.out.print("What is your favorite number? ");

        int num = s.nextInt();

        System.out.println("Your favorite number is: " + num);
    }
}
