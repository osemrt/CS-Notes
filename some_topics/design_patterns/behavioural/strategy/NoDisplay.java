package strategy;

public class NoDisplay implements Displayable {
    @Override
    public void display() {
        System.out.print(" NoDisplay ");
    }
}
