package bridge;

public class BridgePatternTest {
    public static void main(String[] args) {


        Fillable fillable1 = new BlackColor();
        Fillable fillable2 = new RedColor();
        Fillable fillable3 = new GreenColor();

        Shape shape1 = new Circle(fillable1);
        shape1.applyColor();

        Shape shape2 = new Triangle(fillable2);
        shape2.applyColor();

        Shape shape3 = new Pentagon(fillable3);
        shape3.applyColor();



    }
}
