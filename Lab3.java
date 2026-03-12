import java.util.Scanner;

public class Lab3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input;
        char choice;

        Intmiddle t = new Intmiddle();

        System.out.println("WHERE'S THE MIDDLE?");
        System.out.println();

        System.out.print("Do you want to play (y/n)? ");
        input = sc.nextLine();
        choice = input.charAt(0);

        while (choice == 'y' || choice == 'Y') {

            System.out.print("Enter int #1: ");
            t.a = sc.nextInt();

            System.out.print("Enter int #2: ");
            t.b = sc.nextInt();

            System.out.print("Enter int #3: ");
            t.c = sc.nextInt();

            sc.nextLine(); // clear Enter key

            System.out.println("The middle value is: " + t.middle());
            System.out.println();

            System.out.print("Do you want to play again (y/n)? ");
            input = sc.nextLine();
            choice = input.charAt(0);
        }

        System.out.println("Thanks for playing.");
        sc.close();
    }
}