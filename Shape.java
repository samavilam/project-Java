package griffith;

//ID: 3125216
//Samantha Ávila de Medeiros

// Abstract class Shape serving as a blueprint for geometric shapes
public abstract class Shape {
    // Variable to store the color of the shape
    private String color;

    // Constructor of the Shape class initializing the shape's color
    public Shape(String color) {
        this.color = color;
    }

    // Method to get the color of the shape
    public String getColor() {
        return color;
    }

    // Abstract method to calculate the area of the shape, to be implemented in subclasses
    public abstract double area();

    // Abstract method to calculate the perimeter of the shape, to be implemented in subclasses
    public abstract double perimeter();

    // Overrides the toString method to return a string representation of the shape
    @Override
    public String toString() {
        return "Shape: " + getClass().getSimpleName() + ", Color: " + color;
    }
}