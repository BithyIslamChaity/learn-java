package EighthClass;

public class SimpleCircle {
    private double radius; // Make radius private to follow encapsulation principle

    // Default constructor
    public SimpleCircle() {
        radius = 1.0; // Default radius is 1
    }

    // Constructor with a specified radius
    public SimpleCircle(double newRadius) {
        radius = newRadius; // Initialize radius with the specified value
    }

    // Method to calculate the area of the circle
    public double getArea() {
        return radius * radius * Math.PI; // Area = π * r²
    }

    // Method to calculate the perimeter (circumference) of the circle
    public double getPerimeter() {
        return 2 * radius * Math.PI; // Perimeter = 2 * π * r
    }

    // Getter method for radius (if needed)
    public double getRadius() {
        return radius;
    }

    // Setter method for radius (if needed)
    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    public static void main(String[] args) {
        // Create a SimpleCircle object with the default constructor
        SimpleCircle circle1 = new SimpleCircle();
        System.out.println("This area of the circle with radius " + circle1.getRadius() + " is " + circle1.getArea());

        // Create a SimpleCircle object with a radius of 25
        SimpleCircle circle2 = new SimpleCircle(25);
        System.out.println("This area of the circle with radius " + circle2.getRadius() + " is " + circle2.getArea());

        // Create a SimpleCircle object with a radius of 125
        SimpleCircle circle3 = new SimpleCircle(125);
        System.out.println("This area of the circle with radius " + circle3.getRadius() + " is " + circle3.getArea());

        // Modify the radius of circle2 and print the new area
        circle2.setRadius(100);
        System.out.println("This area of the circle with radius " + circle2.getRadius() + " is " + circle2.getArea());
    }
}
