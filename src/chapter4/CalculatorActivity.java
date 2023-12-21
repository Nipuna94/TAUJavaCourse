package chapter4;
import java.util.Scanner;

public class CalculatorActivity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Your task: Implement a do-while loop with a switch statement
        // The program should repeatedly prompt the user to perform calculations until they choose to exit

        int choice;

        do {
            // Display menu
            System.out.println("Calculator Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            // Read user choice
            choice = scanner.nextInt();

            // Your task: Use a switch statement to perform arithmetic operations based on the user's choice
            // For now, you can simply print the result for each operation

            //Add switch statement here
            String message = switch (choice) {

                case 1 -> message = "You selected Addiction";
                case 2 -> message = "You selected Substraction";
                case 3 -> message = "You selected Multiplication";
                case 4 -> message = "You selected Division";
                default -> message = "Invalid Input.Please enter again";

            };

            System.out.println("\n" + message);
        }
        while (choice != 5); // Repeat until the user chooses to exit

        System.out.println("Exiting the calculator.");
        scanner.close();
    }
}
