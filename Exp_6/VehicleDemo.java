package Exp_6;

public class VehicleDemo {
    public static class Vehicle {
        public void drive() {
            System.out.println("Driving a vehicle");
        }
    }

    public static class Car extends Vehicle {
        public void driveCar() {
            System.out.println("Driving a car");
        }
    }

    public static class Bike extends Vehicle {
        public void driveBike() {
            System.out.println("Driving a bike");
        }
    }
}
