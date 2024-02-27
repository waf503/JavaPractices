import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*User Input*/
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scan.nextLine();
        System.out.println("What is your age? ");
        int edad = scan.nextInt();
        System.out.println("Hello "+name);
        System.out.println("Your Age is: "+edad);
    }
}


