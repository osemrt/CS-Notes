package decorator;

public class DecoratorPatternTest {

    public static void main(String[] args) {


        Pizza pizza1 = new GreekPizza();
        Pizza pizza2 = new ChicagoPizza();
        Pizza pizza3 = new PanPizza();

        pizza1 = new Cheese(pizza1);
        pizza1 = new Onion(pizza1);

        pizza2 = new Tomato(pizza2);

        pizza3 = new Cheese(pizza3);
        pizza3 = new Onion(pizza3);
        pizza3 = new Tomato(pizza3);


        System.out.print("You ordered a GreekPizza : ");
        System.out.println("$" + pizza1.cost());

        System.out.print("You ordered a ChicagoPizza : ");
        System.out.println("$" + pizza2.cost());

        System.out.print("You ordered a PanPizza : ");
        System.out.println("$" + pizza3.cost());

        System.out.println("Your total cost is $" + (pizza1.cost() + pizza2.cost() + pizza3.cost()));



    }

}
