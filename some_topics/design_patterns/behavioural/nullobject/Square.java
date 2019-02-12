package nullobject;

public class Square implements Shape {

    private final double edge;

    public Square() {
        this(1);
    }

    public Square(double edge) {
        this.edge = edge;
    }

    @Override
    public double area() {
        return edge * edge;
    }

    @Override
    public double perimeter() {
        return 4 * edge;
    }

    @Override
    public void draw() {
        System.out.println("A square is being drawn with area: " + area() + " and perimeter: " + perimeter());
    }

    @Override
    public boolean isNull() {
        return false;
    }
}
