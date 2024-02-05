package chapter7;

import java.util.Scanner;

public class ArrayExercise2 {

    private static final int LENGTH = 10;
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] showNumber = inputNumber();
        showNumber(showNumber);

    }

    public static int[] inputNumber(){
        int[] inputNumber = new int[LENGTH];
        System.out.println("Please Enter Numbers");
        for(int i=0; i<LENGTH; i++){
            inputNumber[i] = scanner.nextInt();
        }
        return inputNumber;
    }

    public static void showNumber(int inputNumber[]){
        System.out.print("The contents of array are: ");
        for(int i=0; i<LENGTH; i++){
            System.out.print(inputNumber[i] + " | ");
        }
    }
}
