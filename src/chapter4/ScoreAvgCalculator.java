package chapter4;

import java.util.Scanner;

/*
Nested loop
Find the average of each student's test score
 */
public class ScoreAvgCalculator {

    public static void main(String[] args) {

        //Initialize what we know
        int numberOfStudents = 24;
        int numberOfTests = 4;

        Scanner input = new Scanner(System.in);

        //Process all students
        for (int i=0; i< numberOfStudents; i++){

            double total = 0;

            for(int j=0; j< 4; j++){
                System.out.println("Enter Test Score # " + (j+1));
                double score = input.nextDouble();
                total = total + score;
            }

            double average = total/numberOfTests;
            System.out.println(" Test average for student # " + (i+1) + " is " + average);
        }
        input.close();
    }
}
