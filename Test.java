package griffith;

//ID: 3125216
//Samantha Ávila de Medeiros

// This class is used to test the Shape hierarchy
public class Test {
    public static void main(String[] args) {
        // Testing different shapes
        // Creating a Circle object with color "red" and radius 5
        Circle circle = new Circle("red", 5);
        System.out.println(circle);

        // Creating a Square object with color "blue" and side length 8
        Square square = new Square("blue", 8);
        System.out.println(square);

        // Creating a Rectangle object with color "green", length 6, and width 4
        Rectangle rectangle = new Rectangle("green", 6, 4);
        System.out.println(rectangle);

        // Creating a Triangle object with color "yellow" and side lengths 3, 4, and 5
        Triangle triangle = new Triangle("yellow", 3, 4, 5);
        System.out.println(triangle);
    }
}