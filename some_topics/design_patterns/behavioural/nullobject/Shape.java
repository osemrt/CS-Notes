package nullobject;

public interface Shape {

    double area();
    double perimeter();
    void draw();

    // nice to have method to indicate null object
    boolean isNull();

}
