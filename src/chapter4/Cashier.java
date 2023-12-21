package chapter4;

import java.util.Scanner;

/*
For loop
Write a cashier program that will scan a given number of items and tally the cost.
 */
public class Cashier {

    public static void main(String[] args) {

        //Get the number to scan
        System.out.println("Enter the number of items would you like to scan:");
        Scanner input = new Scanner(System.in);
        int quantity = input.nextInt();


        double total = 0;

        //create loop to iterate through all of the items and accumulate the cost
        for (int i = 0; i<quantity; i++){

            System.out.println("Enter the cost of items:");
            double price = input.nextDouble();
            total = total + price;

        }
        input.close();
        System.out.println("Total Price is " + total);

    }
}
