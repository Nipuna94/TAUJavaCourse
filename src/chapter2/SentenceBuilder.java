package chapter2;

import java.util.Scanner;

public class SentenceBuilder {

    public static void main(String[] args) {

        //1.User enter season of the year
        System.out.println("Enter a season of the year");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        //2.User enter a whole number
        System.out.println("Enter a whole number");
        int number = scanner.nextInt();

        //3.User enter adjective
        System.out.println("Enter a adjective");
        String adjective = scanner.next();
        scanner.close();

        //4.Complete the sentence
        System.out.println(" On a " + adjective +" "+ season + " day, I drink a minimum of " + number + " cups of coffee ");

    }
}
