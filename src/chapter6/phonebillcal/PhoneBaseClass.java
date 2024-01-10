package chapter6.phonebillcal;

import java.util.Scanner;

public class PhoneBaseClass {

    static PhoneBill phoneBill = new PhoneBill();
    static ItemizedBill itemizedBill = new ItemizedBill();
    static PrintOut printOut = new PrintOut();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        //Get the id,base cost,allocated minutes and used minutes
        phoneBill.getId();
        phoneBill.getBaseCost();
        phoneBill.getAllocatedMinutes();
        phoneBill.getUsedMinutes();
        scanner.close();

        //calculate tax and total bill
        double cost = itemizedBill.cost();
        System.out.println(cost);

        //print the bill
    }
}
