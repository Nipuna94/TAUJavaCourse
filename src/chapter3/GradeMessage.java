package chapter3;

import java.util.Scanner;

public class GradeMessage {

    public static void main(String[] args) {

        System.out.println("Enter Your letter Grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        String message;

        switch(grade){
            case "A":
                message = "Excellent Job!";
                break;
            case "B":
                message = "Great Job!";
                break;
            case "C":
                message = "Good Job";
                break;
            case "D":
                message = "You need to work bit hard";
                break;
            case "F":
                message = "Uh oh";
                break;
            default:
                message = "Error,Invalid Grade";
                break;
        }

        System.out.println(message);
    }
}
