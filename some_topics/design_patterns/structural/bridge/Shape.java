package bridge;

public abstract class Shape {

    public final Fillable fillable;

    public Shape(Fillable fillable){
        this.fillable = fillable;
    }

    public abstract void applyColor();

}
