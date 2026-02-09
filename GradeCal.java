import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;

        System.out.println("Enter marks of 5 subjects:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Subject " + i + ": ");
            int marks = sc.nextInt();
            total += marks;
        }

        double average = total / 5.0;
        char grade;

        if (average >= 90)
            grade = 'A';
        else if (average >= 75)
            grade = 'B';
        else if (average >= 60)
            grade = 'C';
        else if (average >= 40)
            grade = 'D';
        else
            grade = 'F';

        System.out.println("\nTotal Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
