package chapter4;

import java.util.Random;

public class RollTheDieGame {

    public static void main(String[] args) {

        int space = 20;
        int total = 0;
        Random random = new Random();

        for(int i=0; 4 > i; i++ ) {
            System.out.println("Roll the die");
            int die = random.nextInt(6) + 1;
            System.out.println("You rolled " + die);
            total = total + die;
        }
            if( total == space){
                System.out.println("You are on space 20, Congratulations");
            }
            else{
                System.out.println("You are on space" + total + "you lost");
            }

        }
    }

