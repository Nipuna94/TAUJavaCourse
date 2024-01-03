package chapter6.phonebillcal;

import java.util.Scanner;

public class PhoneBaseClass {

    static PhoneBill phoneBill = new PhoneBill();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        //Get the id,base cost,allocated minutes and used minutes
        phoneBill.getId();
        phoneBill.getBaseCost();
        phoneBill.getAllocatedMinutes();
        phoneBill.getUsedMinutes();
        scanner.close();

        //calculate tax and total bill

        //print the bill
    }
}
