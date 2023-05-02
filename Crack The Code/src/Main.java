import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome. What is your name?");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + ". Are you ready to crack the code?");
        String confirmation = scanner.nextLine().toLowerCase();
        if (confirmation.equals("yes")) {
            System.out.println("\nPHASE 1");
            System.out.println("Enter a string:");
            String ans = scanner.nextLine();
            if (ans.length() == 3) {
                System.out.println("Correct!\n");
                System.out.println("PHASE 2");
                System.out.println("Enter a number:");
                int num1 = scanner.nextInt();
                if (num1 == 19 || num1 >= 35 && num1 < 78) {
                    System.out.println("Correct!\n");
                    System.out.println("PHASE 3");
                    System.out.println("Enter a number:");
                    int num2 = scanner.nextInt();
                    if (num2 <= 0) {
                        System.out.println("Sorry, that was incorrect!");
                        System.out.println("Better luck next time!");
                        System.exit(0);
                    }
                    if (num2 % 2 == 0 || num2 % 10 == 1) {
                        System.out.println("Correct!");
                        System.out.println("You have cracked the code!");
                    }
                    else {
                        System.out.println("Sorry, that was incorrect!");
                        System.out.println("Better luck next time!");
                        System.exit(0);
                    }
                }
                else {
                    System.out.println("Sorry, that was incorrect!");
                    System.out.println("Better luck next time!");
                    System.exit(0);
                }
            }
            else {
                System.out.println("Sorry, that was incorrect!");
                System.out.println("Better luck next time!");
                System.exit(0);
            }

        } else if (confirmation.equals("no")) {
            System.exit(0);
        }
        else {
            System.out.println("That was not a correct input.");
            System.exit(0);
        }
    }
}