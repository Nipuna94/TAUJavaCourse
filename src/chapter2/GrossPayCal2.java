package chapter2;

import java.util.Scanner;

public class GrossPayCal2 {
    public static void main(String[] args) {

        //1. Get the hours
        System.out.println("Enter the Employee work hours:");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        //2. Get the rate
        System.out.println("Enter the rate");
        double rate = scanner.nextDouble();
        scanner.close();

        //3. Multiply both and print the answer
        double salary = hours * rate;
        System.out.println("Your salary is: " + salary);
    }
    }



