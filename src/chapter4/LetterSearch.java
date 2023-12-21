package chapter4;

import java.util.Scanner;

/*
loop break
Search a string to determine if it contains the letter 'A'
 */
public class LetterSearch {

    public static void main(String[] args) {

        //Get Text
        System.out.println("Enter some text:");
        Scanner input = new Scanner(System.in);
        String text = input.next();

        boolean letterFound = false;

        //Search text for A
        for (int i=0; i<text.length(); i++){
            char currentLetter = text.charAt(i);
            if (currentLetter == 'A' || currentLetter == 'a'){
                letterFound = true;
                break;
            }
        }
        int textCount = text.length();
        System.out.println("Text contains " + textCount + " letters");

        if (letterFound){
            System.out.println("This text contains letter 'A' ");
        }
        else{
            System.out.println("This text not contains letter 'A'");
        }

    }

}
