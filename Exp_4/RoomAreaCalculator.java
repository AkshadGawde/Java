package Exp_4;

class Room {
    double length;
    double breadth;

    Room(double side) {
        length = side;
        breadth = side;
    }

    Room(double l, double b) {
        length = l;
        breadth = b;
    }

    double calculateArea() {
        return length * breadth;
    }
}

public class RoomAreaCalculator {
    public static void main(String[] args) {
        Room squareRoom = new Room(10.0);
        Room rectangularRoom = new Room(12.0, 8.0);

        double areaOfSquareRoom = squareRoom.calculateArea();
        System.out.println("Area of the square room: " + areaOfSquareRoom);

        double areaOfRectangularRoom = rectangularRoom.calculateArea();
        System.out.println("Area of the rectangular room: " + areaOfRectangularRoom);
    }
}
