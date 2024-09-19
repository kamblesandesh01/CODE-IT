import java.util.InputMismatchException;
import java.util.Scanner;
class Task2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            boolean repeat = true;
            while (repeat) {
                try {
                    System.out.print("Enter marks in Physics: ");
                    double physicsMarks = sc.nextDouble();
                    System.out.print("Enter marks in Chemistry: ");
                    double chemistryMarks = sc.nextDouble();
                    System.out.print("Enter marks in Mathematics: ");
                    double mathematicsMarks = sc.nextDouble();
                    System.out.print("Enter marks in Biology: ");
                    double biologyMarks = sc.nextDouble();
                    
                    double totalMarks = physicsMarks + chemistryMarks + mathematicsMarks + biologyMarks;
                    double percentage = (totalMarks / 400) * 100;
                    
                    char grade;
                    if (percentage >= 90) {
                        grade = 'A';
                    } else if (percentage >= 80) {
                        grade = 'B';
                    } else if (percentage >= 70) {
                        grade = 'C';
                    } else if (percentage >= 60) {
                        grade = 'D';
                    } else {
                        grade = 'E';
                    }
                    
                    System.out.println("Total Marks: " + totalMarks);
                    System.out.println("Percentage: " + percentage + "%");
                    System.out.println("Grade: " + grade);
                    
                    System.out.print("Do you want to calculate again? (yes/no): ");
                    String response = sc.next();
                    if (!response.equalsIgnoreCase("yes")) {
                        repeat = false;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    sc.next(); 
                }
            }
        }
    }
}
