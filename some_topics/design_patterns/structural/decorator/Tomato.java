package decorator;

public class Tomato extends PizzaToppings {

    public Tomato(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String description() {
        return "Tomato";
    }

    @Override
    public double cost() {

        return pizza.cost() + 1.0;
    }

}
