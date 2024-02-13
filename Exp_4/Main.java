package Exp_4;

public class Main {
    public static void main(String[] args) {
        Bird bird1 = new Bird();
        Bird bird2 = new Bird("Sparrow");
        Bird bird3 = new Bird("Parrot", 3);

        System.out.println("Name of bird1: " + bird1.getName());
        System.out.println("Name of bird2: " + bird2.getName());
        System.out.println("Name of bird3: " + bird3.getName());
    }
}
