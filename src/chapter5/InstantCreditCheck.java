package chapter5;

import java.util.Scanner;

/*
Variable Scope
Write an instant credit check program that approves anyone who makes more than $25000 and has a credit score of 700 or better.Reject all others.
 */
public class InstantCreditCheck {
    static int requiredSalary = 2000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int creditScore = getCreditScore();
        double salary = getSalary();
        scanner.close();

        //Check if the user is qualified
        boolean qualified = isUserQualified(creditScore, salary);

        //Notify the user
        notifyUser(qualified);
    }
    public static double getSalary() {
        System.out.println("Enter your Salary:");
        double salary = scanner.nextDouble();
        return salary;
    }
    public static int getCreditScore() {
        System.out.println("Enter your credit score:");
        int creditScore = scanner.nextInt();
        return creditScore;
    }

    public static boolean isUserQualified(int creditScore, double salary) {

        if(creditScore >= requiredCreditScore && salary >= requiredSalary) {
            return true;
        }
        else{
            return false;
            }
        }
    public static void notifyUser(boolean isQualified){
        if(isQualified){
            System.out.println("Congratz! Youre been approved.");
        }
        else{
            System.out.println("Sorry not qualified");
        }
    }
}
