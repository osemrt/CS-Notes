package nullobject;

public class ShapeFactory {

    public static Shape getShape(String shapeType){

        Shape shape = null;


        if("Circle".equalsIgnoreCase(shapeType)){
            shape = new Circle();
        }else if("Square".equalsIgnoreCase(shapeType)){
            shape = new Square();
        }else if("Triangle".equalsIgnoreCase(shapeType)){
            shape = new Triangle();
        }else{
            shape = new Null();
        }

        return shape;


    }



}
