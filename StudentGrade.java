import java.util.Arrays;
import java.util.Scanner;

import java.util.InputMismatchException; 

public class StudentGrade { 

    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);

        int numberOfStudents;
        int numberOfSubjects;
        float total = 0;
        float average = 0;

        try {
            System.out.print("How many students do you have in your class this term: ");
            numberOfStudents = scann.nextInt();

            System.out.println("How many subjects did each student take: ");
            numberOfSubjects = scann.nextInt();

            System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("Saved successfully");

            int[][] grade = new int[numberOfStudents][numberOfSubjects];

            for (int index = 0; index < numberOfStudents; index++) {
                System.out.print("Student " + (index + 1) + " ");
                System.out.println();

                for (int secondIndex = 0; secondIndex < numberOfSubjects; secondIndex++) {

                    System.out.printf("Enter Score For Sub " + (secondIndex + 1) + " \n" + " ");

                    try {
                        grade[index][secondIndex] = scann.nextInt();
                        System.out.println("Saving >>>>>>>>>>>>>>>>>>");
                        System.out.println("Saved successfully");
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input!!! Please Enter An Integer::");
                        scann.nextInt(); // Consume the invalid input
                        secondIndex--; // Decrement secondIndex to retry input for the same subject
                    }
                }
            }


            for (int jj = 0; jj < numberOfSubjects; jj++) {
                System.out.print("\t" + "Sub" + (jj + 1) + "\t");
            }
            System.out.print("TOT" + "\t");
            System.out.print("AVE");
            System.out.println();


            for (int i = 0; i < numberOfStudents; i++) {
                total = 0; // Reset total for each student
                average = 0;

                for (int j = 0; j < numberOfSubjects; j++) {
                    total += grade[i][j];
                    average = total / numberOfSubjects;
                    System.out.print("\t" + grade[i][j] + "\t");
                }

                System.out.print(total);
                System.out.print("\t" + average);
                System.out.println();
            }


            int highest = grade[0][1]; // Potential issue - might need adjustment depending on logic
            int lowest = grade[0][1];
            for (int a = 0; a < grade[0].length; a++) {
                for (int b = 0; b < grade.length; b++) {
                    if (grade[a][0] > highest) highest = grade[a][1];
                    if (grade[a][0] < lowest) lowest = grade[a][1];
                }
            }

            System.out.println("Highest: " + highest);
            System.out.println("Lowest: " + lowest);

        } catch (InputMismatchException e) {
            System.out.println("Input is Invalid. Please Enter An Integer:");
            scann.nextInt(); // Consume the invalid input
        }
    }
}