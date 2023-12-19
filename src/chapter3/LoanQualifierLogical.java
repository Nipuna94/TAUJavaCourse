package chapter3;

import java.util.Scanner;

/*
Logical operator
To qualify for a loan, a person must make at least $30,000
and have been working at their current job for at least 2 years.
 */
public class LoanQualifierLogical {

    public static void main(String[] args) {

        //Initialize what we know
        double salary = 3000;
        double years = 2;

        //Ask for what we dont know
        System.out.println("Whats your current salary:");
        Scanner scanner = new Scanner(System.in);
        double currentSalary = scanner.nextDouble();

        System.out.println("How many years did you work for this company:");
        double serviceYears = scanner.nextDouble();
        scanner.close();

        //Logical cal
        if (currentSalary >= salary && serviceYears >= years  )
            System.out.println("Congratulations you are eligible for loan");
        else
            System.out.println("You are not eligible");
    }
}
