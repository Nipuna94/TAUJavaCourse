package chapter3;

import java.util.Scanner;

public class TenRupeesGame {

    public static void main(String[] args) {

        System.out.println("How many 1 rupee coins would you like?");
        Scanner scanner = new Scanner(System.in);
        int oneRupee = scanner.nextInt();

        System.out.println("How many 2 rupee coins would you like?");
        int twoRupee = scanner.nextInt();

        System.out.println("How many 5 rupee coins would you like?");
        int fiveRupee = scanner.nextInt();

        int twoRupeeCount = twoRupee * 2;
        int fiveRupeeCount = fiveRupee * 5;
        int totalCount = twoRupeeCount + oneRupee + fiveRupeeCount;

        int tenRupeeCount = 10;

        if( tenRupeeCount == totalCount )
            System.out.println("Congratulations you won");
        else if ( totalCount < tenRupeeCount )
            System.out.println("You are " + (tenRupeeCount - totalCount) + " short! ");
        else
            System.out.println("You are " + (totalCount - tenRupeeCount) + " more");
    }
}
