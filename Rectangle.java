package griffith;

// Rectangle class representing a rectangle shape, extending the Shape class
public class Rectangle extends Shape {
    // Private variables to store the width and length of the rectangle
    private double width;
    private double length;

    // Constructor to initialize the Rectangle with a color, width, and length
    public Rectangle(String color, double width, double length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    // Getter method to retrieve the width of the rectangle
    public double getWidth() {
        return width;
    }

    // Getter method to retrieve the length of the rectangle
    public double getLength() {
        return length;
    }

    // Override method to calculate the area of the rectangle
    @Override
    public double area() {
        return width * length;
    }

    // Override method to calculate the perimeter of the rectangle
    @Override
    public double perimeter() {
        return 2 * (width + length);
    }

    // Override method to return a string representation of the rectangle
    @Override
    public String toString() {
        return super.toString() + String.format(", Width: %.2f, Length: %.2f, Area: %.2f, "
                + "Perimeter: %.2f", width, length, area(), perimeter());
    }
}
