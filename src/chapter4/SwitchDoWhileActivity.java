package chapter4;
import java.util.Scanner;

public class SwitchDoWhileActivity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Your task: Implement a do-while loop with a switch statement
        // The program should repeatedly prompt the user to choose an option until they choose to exit

        int choice;

        do {
            // Display menu
            System.out.println("Menu:");
            System.out.println("1. Option 1");
            System.out.println("2. Option 2");
            System.out.println("3. Option 3");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            // Read user choice
            choice = scanner.nextInt();

            // Your task: Use a switch statement to perform actions based on the user's choice
            // For now, you can simply print a message for each option

            //Add switch statement here
            String message = switch (choice){
                case 1 -> "You selected Option 1";
                case 2 -> "You Selected Option 2";
                case 3 -> "You Selected Option 3";
                default -> "Invalid Input.Enter Again";
            };

            System.out.println(message + "\n");

        } while (choice != 4); // Repeat until the user chooses to exit

        System.out.println("Exiting the program.");
        scanner.close();
    }
}

