import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks;

        System.out.print("Enter student marks (0-100): ");
        marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid Marks!");
        }
        else if (marks >= 80) {
            System.out.println("Grade: A");
        }
        else if (marks >= 60) {
            System.out.println("Grade: B");
        }
        else if (marks >= 40) {
            System.out.println("Grade: C");
        }
        else {
            System.out.println("Grade: Fail");
        }

        sc.close();
    }
}
