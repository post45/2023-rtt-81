package assignmentStatements303_4_1;

import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your numeric score: ");
        int score = scanner.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("Score out of range");
        } else {
            char grade;
            if (score >= 90 && score <= 100) {
                grade = 'A';
            } else if (score >= 80 && score < 90) {
                grade = 'B';
            } else if (score >= 70 && score < 80) {
                grade = 'C';
            } else if (score >= 60 && score < 70) {
                grade = 'D';
            } else {
                grade = 'F';
            }
            System.out.println("Your letter grade is: " + grade);
        }
        scanner.close();
    }
}
