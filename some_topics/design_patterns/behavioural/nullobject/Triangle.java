package nullobject;

public class Triangle implements Shape {

    private final double edge1;
    private final double edge2;
    private final double edge3;

    public Triangle() {
        this(1, 1, 1);
    }

    public Triangle(double edge1, double edge2, double edge3) {
        this.edge1 = edge1;
        this.edge2 = edge2;
        this.edge3 = edge3;
    }

    @Override
    public double area() {
        double u = (edge1 + edge2 + edge3) / 2;
        return Math.sqrt(u*(u-edge1)*(u-edge2)*(u-edge3));
    }

    @Override
    public double perimeter() {
        return edge1 + edge2 + edge3;
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
