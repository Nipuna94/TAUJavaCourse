package chapter3;

import java.util.Scanner;

/*
Nested Ifs:
To qualify for a loan, a person must make at least $30,000
and have been working at their current job for at least 2 years.
 */
public class LoanQualifier {

    public static void main(String[] args) {

        //initialize what we know
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        //Get the values we don't know
        System.out.println("Enter your salary:");
        Scanner scanner = new Scanner(System.in);
        int currentSalary = scanner.nextInt();

        System.out.println("Enter years of service:");
        int serviceYears = scanner.nextInt();
        scanner.close();

        // make the calculation
        if ( currentSalary >= requiredSalary ){
            if ( serviceYears >= requiredYearsEmployed )
                System.out.println("You are eligible for the loan");

            else{
                System.out.println("Your service years not enough for a loan");
            }
        }
        else{
            System.out.println("Your salary is not enough for a loan");
        }
    }
}
