package decorator;

public class ChicagoPizza implements Pizza {
    @Override
    public String description() {
        return "ChicagoPizza";
    }

    @Override
    public double cost() {
        return 13.0;
    }
}
