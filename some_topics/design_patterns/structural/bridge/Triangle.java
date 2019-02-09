package bridge;

public class Triangle extends Shape {

    public Triangle(Fillable fillable) {
        super(fillable);

    }

    @Override
    public void applyColor() {
        System.out.print("Triangle filled with color ");
        fillable.fill();
    }
}
