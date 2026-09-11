import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks (0-100): ");
        int marks = scanner.nextInt();

        /*
         * The if-else ladder checks the marks from highest
         * grade to lowest grade.
         *
         * 90 - 100 = Grade A
         * 80 - 89  = Grade B
         * 70 - 79  = Grade C
         * 60 - 69  = Grade D
         * Below 60 = Grade F
         */

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks.");
        } else if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 80) {
            System.out.println("Grade: B");
        } else if (marks >= 70) {
            System.out.println("Grade: C");
        } else if (marks >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        scanner.close();
    }
}