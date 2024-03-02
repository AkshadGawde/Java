package Exp_6;

import Exp_6.PersonDemo.Person;
import Exp_6.PersonDemo.Student;
import Exp_6.PersonDemo.Teacher;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.0, "Red");
        System.out.println(circle.toString());
        System.out.println(circle.getArea());

        Cylinder cylinder = new Cylinder(3.0, "Blue", 5.0);
        System.out.println(cylinder.toString());
        System.out.println(cylinder.getArea());
        System.out.println(cylinder.getVolume());
    }
}

// public class Main {
// public static void main(String[] args) {
// Person person = new Person();
// Student student = new Student();
// Teacher teacher = new Teacher();

// person.speak();
// student.speak();
// teacher.speak();
// }
// }
