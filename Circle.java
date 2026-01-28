// File: Circle.java

public class Circle {

    // private data member
    private double radius;

    // constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // setter method
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // getter method
    public double getRadius() {
        return radius;
    }

    // method to calculate area of circle
    public double calculateArea() {
        return 3.1416 * radius * radius;
    }
}
