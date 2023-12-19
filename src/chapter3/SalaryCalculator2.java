package chapter3;

import java.util.Scanner;

/*
If Statement
All salespeople get a payment of $1000 a week.
Salespeople who exceed 10 sales get an additional bonus of $250.
 */
public class SalaryCalculator2 {
    public static void main(String[] args) {
        int basesalary = 1000;
        int bonus = 250;
        int quota = 10;

        System.out.println("Enter your sales for this week: ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if ( sales > quota){
            basesalary = basesalary + bonus;
        }
        System.out.println("Your salary is " + basesalary);
    }
}
