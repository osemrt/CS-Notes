package strategy;

public class StrategyPatternTest {
    public static void main(String[] args) {

        Duck duck1 = new Duck(new SimpleDisplay(), new SimpleFly(), new SimpleQuack());
        Duck duck2 = new Duck(new NoDisplay(), new NoFly(), new NoQuack());
        Duck duck3 = new Duck(new SimpleDisplay(), new SimpleFly(), new SimpleQuack());


        duck1.display();
        duck1.fly();
        duck1.quack();
        System.out.println();
        duck2.display();
        duck2.fly();
        duck2.quack();
        System.out.println();
        duck3.display();
        duck3.fly();
        duck3.quack();






    }
}
