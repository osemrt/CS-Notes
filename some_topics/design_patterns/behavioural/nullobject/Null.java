package nullobject;

public class Null implements Shape {
    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public void draw() {
        System.out.println("A null object can't be drawn!");
    }

    @Override
    public boolean isNull() {
        return true;
    }
}
