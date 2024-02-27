package Exp_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentMarksSystem studentMarksSystem = new StudentMarksSystem();
        StudentMarksSystem.Student student = studentMarksSystem.new Student();
        student.inputData();
        student.printData();

        StudentMarksSystem.Marks marks = studentMarksSystem.new Marks();
        marks.readData();
        marks.compute();
        marks.show();
    }
}
