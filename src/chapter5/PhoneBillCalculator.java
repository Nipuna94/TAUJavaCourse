package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {

    static double chargePerMinute = 0.25;
    static double tax = 0.15;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double planFee = getPlanFee();
        double overageTime = getOverageTime();
        scanner.close();

        double overageTimeFee = calculateOverageTimeFee(overageTime);

        double totalBeforeTax = calculateTotalBeforeTax(overageTimeFee,planFee);

        double taxedAmount = taxAmount(totalBeforeTax);

        double totalBill = totalAfterTax(totalBeforeTax,taxedAmount);

        printBill(planFee,overageTimeFee,taxedAmount,totalBill);

    }


    //Get the plan amount from user
    public static double getPlanFee() {
        System.out.println(" Enter base cost of the plan: ");
        double planFee = scanner.nextDouble();
        return planFee;
    }
    //get the overage time from user
    public static double getOverageTime() {
        System.out.println(" Enter overage minutes: ");
        double overageTime = scanner.nextDouble();
        return  overageTime;
    }
    //calculate overage fee
    public static double calculateOverageTimeFee(double overageTime) {
        double overageTimeFee = overageTime*chargePerMinute;
        return overageTimeFee;
    }
    //calculate total before the tax
    public static double calculateTotalBeforeTax(double overageTimeFee,double planFee) {
        double totalBeforeTax = overageTimeFee+planFee;
        return totalBeforeTax;
    }
    //calculate tax amount
    public static double taxAmount(double totalBeforeTax) {
        double taxAmount = totalBeforeTax*tax;
        return taxAmount;
    }
    //calculate total
    public static double totalAfterTax(double totalBeforeTax, double taxedAmount) {
        double totalAfterTax = totalBeforeTax+taxedAmount;
        return totalAfterTax;
    }

    //print the invoice
    public static void printBill(double planFee, double overageTimeFee,double taxedAmount,double totalBill){
        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + String.format("%.2f",planFee));
        System.out.println("Overage: $" + String.format("%.2f",overageTimeFee));
        System.out.println("Tax: $" +  String.format("%.2f",taxedAmount));
        System.out.println("Total: $" + String.format("%.2f",totalBill));
    }

}
