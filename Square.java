package griffith;

//ID: 3125216
//Samantha Ávila de Medeiros

// Square class representing a square shape, extending the Shape class
public class Square extends Shape {
    // Private variable to store the length of the square's side
    private double length;

    // Constructor to initialize the Square with a color and side length
    public Square(String color, double length) {
        super(color);
        this.length = length;
    }

    // Getter method to retrieve the length of the square's side
    public double getLength() {
        return length;
    }

    // Override method to calculate the area of the square
    @Override
    public double area() {
        return length * length;
    }

    // Override method to calculate the perimeter of the square
    @Override
    public double perimeter() {
        return 4 * length;
    }

    // Override method to return a string representation of the square
    @Override
    public String toString() {
        return super.toString() + String.format(", Length: %.2f, Area: %.2f, Perimeter: %.2f", 
        		length, area(), perimeter());
    }
}