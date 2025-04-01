public class Main {
    public static void main(String[] args) {
        A a = new A();

        // Create instances of the shape classes
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 4, 5);
    
        // Perform operations on the shapes
        double circleArea = circle.getArea();
        double rectanglePerimeter = rectangle.getPerimeter();
        double triangleArea = triangle.getArea();
    
        // Print the results
        System.out.println("Circle area: " + circleArea);
        System.out.println("Rectangle perimeter: " + rectanglePerimeter);
        System.out.println("Triangle area: " + triangleArea);
}
}