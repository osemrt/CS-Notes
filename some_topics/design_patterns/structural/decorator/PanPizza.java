package decorator;

public class PanPizza implements Pizza {
    @Override
    public String description() {
        return "PanPizza";
    }

    @Override
    public double cost() {
        return 15.0;
    }
}
