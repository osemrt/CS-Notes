package decorator;

public class Onion extends PizzaToppings {

    public Onion(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String description() {
        return "Onion";
    }

    @Override
    public double cost() {

        return pizza.cost() + 1.5;
    }

}
