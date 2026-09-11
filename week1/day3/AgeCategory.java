import java.util.Scanner;

public class AgeCategory {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age < 0) {
            System.out.println("Invalid age.");
        } else if (age <= 12) {
            System.out.println("Category: Child");
        } else if (age <= 19) {
            System.out.println("Category: Teenager");
        } else if (age <= 59) {
            System.out.println("Category: Adult");
        } else {
            System.out.println("Category: Senior");
        }

        scanner.close();
    }
}