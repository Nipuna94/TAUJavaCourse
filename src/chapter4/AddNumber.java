package chapter4;

import java.util.Scanner;

/*
Do while loop
Write a program that allows a user to enter to numbers, and then sum up the two numbers. the user should be able to repeat this action until they indicate they are done.
 */
public class AddNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean again;
        do {
            System.out.println("Enter First Number:");
            double num1 = scanner.nextDouble();

            System.out.println("Enter Second Number:");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;

            System.out.println("The sum is " + sum);

            System.out.println("Would yo like to start over? True or false");
            again = scanner.nextBoolean();

        }while(again);

        scanner.close();
    }

}
