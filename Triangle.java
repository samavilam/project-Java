package griffith;

//ID: 3125216
//Samantha Ávila de Medeiros

public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    @Override
    public double area() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Side1: %.2f, Side2: %.2f, "
        		+ "Side3: %.2f, Area: %.2f, Perimeter: %.2f", side1, side2, side3, area(), 
        		perimeter());
    }
}
