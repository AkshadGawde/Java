package Exp_6;

public class PersonDemo {
    public static class Person {
        public void speak() {
            System.out.println("The person is speaking");
        }
    }

    public static class Student extends Person {
        @Override
        public void speak() {
            System.out.println("The student is asking a question");
        }
    }

    public static class Teacher extends Person {
        @Override
        public void speak() {
            System.out.println("The teacher is giving a lecture");
        }
    }
}
