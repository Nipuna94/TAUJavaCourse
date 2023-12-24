package chapter5;

import java.util.Scanner;

/*
First method
Write a method that ask a user for their name then greets them by name.
 */
public class Greetings {

    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        greetUser(name);
        //System.out.println("Test");
    }

    public static void greetUser(String name){
        System.out.println("Hi there, " + name);
    }
}
