package chapter7;

import java.util.Scanner;

public class DayPrinter {

    static String[] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    public static void main(String[] args) {
        getDayNumber();

    }

    public static void getDayNumber(){
        System.out.println("Enter number between 1 to 7");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        switch(day){
            case 1 :
                System.out.println(days[0]);
                break;
            case 2:
                System.out.println(days[1]);
                break;
            case 3:
                System.out.println(days[2]);
                break;
            case 4:
                System.out.println(days[3]);
                break;
            case 5:
                System.out.println(days[4]);
                break;
            case 6:
                System.out.println(days[5]);
                break;
            case 7:
                System.out.println(days[6]);
                break;
            default:
                System.out.println("Enter valid number");
        }


    }
}
