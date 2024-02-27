package Exp_6;

import java.util.Scanner;

public class StudentMarksSystem {

    class Student {
        String name;
        int rollNumber;
        String dob;

        public void inputData() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter student name:");
            name = scanner.nextLine();
            System.out.println("Enter roll number:");
            rollNumber = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.println("Enter date of birth:");
            dob = scanner.nextLine();
        }

        public void printData() {
            System.out.println("Student Details:");
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Date of Birth: " + dob);
        }
    }

    class Marks {
        int[] subjectsMarks = new int[5];
        double totalPercentage;
        char grade;

        public void readData() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter marks for 5 subjects (out of 100):");
            for (int i = 0; i < 5; i++) {
                System.out.print("Subject " + (i + 1) + ": ");
                subjectsMarks[i] = scanner.nextInt();
            }
        }

        public void compute() {
            int totalMarks = 0;
            for (int marks : subjectsMarks) {
                totalMarks += marks;
            }
            totalPercentage = (double) totalMarks / 5;

            if (totalPercentage >= 90) {
                grade = 'A';
            } else if (totalPercentage >= 80) {
                grade = 'B';
            } else if (totalPercentage >= 70) {
                grade = 'C';
            } else if (totalPercentage >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }
        }

        public void show() {
            System.out.println("Marks in various subjects:");
            for (int i = 0; i < 5; i++) {
                System.out.println("Subject " + (i + 1) + ": " + subjectsMarks[i]);
            }
            System.out.println("Total Percentage: " + totalPercentage);
            System.out.println("Grade: " + grade);
        }
    }
}
