package chapter3;

import java.util.Scanner;

/*
If else
All salespeople are expected to make at least 10 sales each week.
For those who do, they receive a congratulatory message.
for those who don't, they are informed of how many sales they were short
 */
public class QuotaCalculator {

    public static void main(String[] args) {

        //Initialize values we know
        int quota = 10;

        //Get the values we don't know
        System.out.println("How many sales did you make this week:");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Make a decision on the path to take - output
        // If you got one statement you can remove curly braces
        if ( sales >= quota )
            System.out.println(" Congratulations you make " + sales + " this week! ");

        else {
            int salesShort = quota - sales;
            System.out.println("You are " + salesShort + " sales shorts for this week");
        }
    }
}
