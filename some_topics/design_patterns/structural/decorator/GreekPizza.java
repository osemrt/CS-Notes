package decorator;

public class GreekPizza implements Pizza {
    @Override
    public String description() {
        return "GreekPizza";
    }

    @Override
    public double cost() {
        return 12.0;
    }
}
