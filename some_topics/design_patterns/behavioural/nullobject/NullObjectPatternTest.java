package nullobject;

public class NullObjectPatternTest {

    public static void main(String[] args) {

        ShapeType[] shapeTypes = ShapeType.values();

        for(ShapeType shapeType : shapeTypes){

            Shape shape = ShapeFactory.getShape(shapeType.toString());

            // no null-check required since shape factory always creates shape objects!
            System.out.println("Shape area: " + shape.area());
            System.out.println("Shape Perimeter: " + shape.perimeter());
            shape.draw();
            System.out.println();
        }

        Shape shape = ShapeFactory.getShape("Trapezoid");
        System.out.println("Shape area: " + shape.area());
        System.out.println("Shape Perimeter: " + shape.perimeter());
        shape.draw();
        System.out.println();


    }


}
