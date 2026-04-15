import java.util.Scanner;

public class C3GradingSystem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the marks: ");
        int marks = scn.nextInt();

        if (marks > 90 && marks <= 100) {
            System.out.println("O");
        } else if (marks > 80 && marks <= 90) {
            System.out.println("A+");
        } else if (marks > 70 && marks <= 80) {
            System.out.println("A");
        } else if (marks > 60 && marks <= 70) {
            System.out.println("B");
        } else if (marks > 100) {
            System.out.println("Marks are out of range");
        } else {
            System.out.println("C");
        }

        scn.close();
    }

}
