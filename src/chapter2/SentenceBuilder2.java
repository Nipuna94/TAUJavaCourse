package chapter2;


import java.util.Scanner;

/*
On this [adjective][season] day , ill drink [whole number] cup of cofees
 */
public class SentenceBuilder2 {

    public static void main(String[] args) {

        System.out.println("Enter an adjective");
        Scanner scanner = new Scanner(System.in);
        String adjective = scanner.next();

        System.out.println("Enter a season:");
        String season = scanner.next();

        System.out.println("Enter a whole number");
        int number = scanner.nextInt();
        scanner.close();

        System.out.println("On this " + adjective +" "+ season +" day,ill drink " + number + " cup of cofees");
    }
}
