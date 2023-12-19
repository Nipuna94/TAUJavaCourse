package chapter3;

import java.util.Scanner;

/*
If Statement
All salespeople get a payment of $1000 a week.
Salespeople who exceed 10 sales get an additional bonus of $250.
 */
public class SalaryCalculator {

    public static void main(String[] args) {

        //Initialize the known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        //Get the values for the unknown
        System.out.println("Enter the sales amount of this week:");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Quick detour for the bonus earners
        if (sales > quota){
            salary = salary + bonus;
        }
        //Outputs
        System.out.println("The employee pay is $" + salary);
    }
}
