package chapter6.phonebillcal;


import java.sql.SQLOutput;
import java.util.Scanner;

public class PhoneBill {

    static Scanner scanner = new Scanner(System.in);
    public double getId(){
        System.out.println("Enter your ID");
        double id = scanner.nextDouble();
        return id;
    }

    public double getBaseCost(){
        System.out.println("Enter your Base Cost");
        double baseCost = scanner.nextDouble();
        return baseCost;
    }

    public double getAllocatedMinutes(){
        System.out.println("Enter allocated minutes");
        double allocatedMinutes = scanner.nextDouble();
        return allocatedMinutes;
    }

    public double getUsedMinutes(){
        System.out.println("Enter used minutes");
        double usedMinutes = scanner.nextDouble();
        return usedMinutes;
    }
}
