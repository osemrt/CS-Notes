package decorator;

public class Cheese extends PizzaToppings {

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String description() {
        return "Cheese";
    }

    @Override
    public double cost() {
        return pizza.cost() + 2.5;
    }

}
