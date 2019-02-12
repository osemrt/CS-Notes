package strategy;

public class NoFly implements Flyable {
    @Override
    public void fly() {
        System.out.print(" NoFly ");
    }
}
