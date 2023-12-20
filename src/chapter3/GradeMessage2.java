package chapter3;

import java.util.Scanner;

public class GradeMessage2 {

    public static void main(String[] args) {

        //Initialize known values
        System.out.println("Enter the Number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        //switch case
        String message = switch(number){
            case 1 -> "You Selected One";
            case 2 -> "You Selected Two";
            case 3 -> "You Selected Three";
            case 4 -> "You Selected Four";
            case 5 -> "You Selected Five";
            default -> "Enter Valid Number";
        };

        System.out.println(message);

    }
}
