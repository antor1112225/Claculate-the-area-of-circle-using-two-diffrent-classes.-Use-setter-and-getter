// File: CircleTest.java

public class CircleTest {

    public static void main(String[] args) {

        // object created using constructor
        Circle c1 = new Circle(5);

        System.out.println("Radius: " + c1.getRadius());
        System.out.println("Area of Circle: " + c1.calculateArea());

        // changing radius using setter
        c1.setRadius(7);

        System.out.println("Updated Radius: " + c1.getRadius());
        System.out.println("Updated Area of Circle: " + c1.calculateArea());
    }
}
