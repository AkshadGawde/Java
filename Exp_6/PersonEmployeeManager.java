package Exp_6;

public class PersonEmployeeManager {
    public static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void display() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }

    public static class Employee extends Person {
        double salary;

        public Employee(String name, int age, double salary) {
            super(name, age);
            this.salary = salary;
        }

        public void displayEmp() {
            super.display();
            System.out.println("Salary: " + salary);
        }
    }

    public static class Manager extends Employee {
        String department;

        public Manager(String name, int age, double salary, String department) {
            super(name, age, salary);
            this.department = department;
        }

        public void displayManager() {
            super.displayEmp();
            System.out.println("Department: " + department);
        }
    }
}
// OVERRIDE :
// public class animal{
// public void makeSound(){
// System.out.println("Animal make sounds");
// }
// }

// public class dog extends animal{
// public static void main(String[] args) {
// System.out.println("bow bow");
// }
// }

// OVERLOAD:

// public class MathOperations {
// public int add(int a, int b) {
// return a + b;
// }
// public double add (double a, double b){
// return a+b;
// }
// }