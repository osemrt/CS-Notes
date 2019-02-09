package bridge;

public class Circle extends Shape {
    public Circle(Fillable fillable) {
        super(fillable);
    }

    @Override
    public void applyColor() {
        System.out.print("Circle filled with color ");
        fillable.fill();
    }
}
