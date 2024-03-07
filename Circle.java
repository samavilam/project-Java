package griffith;

//ID: 3125216
//Samantha Ávila de Medeiros

// Circle class representing a circle shape, extending the Shape class
public class Circle extends Shape {
    // Private variable to store the radius of the circle
    private double radius;

    // Constructor to initialize the Circle with a color and radius
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    // Getter method to retrieve the radius of the circle
    public double getRadius() {
        return radius;
    }

    // Override method to calculate the area of the circle
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    // Override method to calculate the perimeter (circumference) of the circle
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    // Override method to return a string representation of the circle
    @Override
    public String toString() {
        return super.toString() + String.format(", Radius: %.2f, Area: %.2f, "
                + "Perimeter: %.2f", radius, area(), perimeter());
    }
}