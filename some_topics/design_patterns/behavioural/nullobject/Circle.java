package nullobject;

public class Circle implements Shape {

    private final double radius;

    public Circle() {
        this(1);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius ;
    }

    @Override
    public void draw() {
        System.out.println("A circle is being drawn with area: " + area() + " and perimeter: " + perimeter());
    }

    @Override
    public boolean isNull() {
        return false;
    }
}
