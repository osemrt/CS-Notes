package bridge;

public class Pentagon extends Shape {

    public Pentagon(Fillable fillable) {
        super(fillable);
    }

    @Override
    public void applyColor() {
        System.out.print("Pentagon filled with color ");
        fillable.fill();
    }
}
