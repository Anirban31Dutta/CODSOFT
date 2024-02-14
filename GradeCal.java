import java.util.Scanner;

public class GradeCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total_Marks = 0;
        int subject_Count = 0;

        System.out.print("Enter the number of subject:");
        subject_Count=scanner.nextInt();


        for(int i=0; i<subject_Count; i++) {
        	System.out.print("Subject of " + (i + 1) + " "+" : ");
            int marks = scanner.nextInt();
            total_Marks += marks;
        }

        double average_Percentage = (double) total_Marks / (subject_Count * 100.0) * 100;
        String grade = "";

        if (average_Percentage >= 90) {
            grade = "A";
        } else if (average_Percentage >= 80) {
            grade = "B";
        } else if (average_Percentage >= 70) {
            grade = "C";
        } else if (average_Percentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Total marks: " + total_Marks);
        System.out.println("Average percentage: " + average_Percentage + "%");
        System.out.println("Grade: " + grade);
    }
}