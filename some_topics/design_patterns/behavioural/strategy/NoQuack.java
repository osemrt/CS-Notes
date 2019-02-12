package strategy;

public class NoQuack implements Quackable {
    @Override
    public void quack() {
        System.out.print(" NoQuack ");
    }
}
