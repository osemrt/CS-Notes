package strategy;

public class SimpleQuack implements Quackable{
    @Override
    public void quack() {
        System.out.print(" SimpleQuack ");
    }
}
