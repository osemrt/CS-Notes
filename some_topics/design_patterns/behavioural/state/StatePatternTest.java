package state;

public class StatePatternTest {

    public static void main(String[] args) {

        Context context = new Context();
        State state1 = new OnState(context);
        State state2 = new OffState(context);

        context.display();

        context.toggle();
        context.display();

        context.toggle();
        context.display();

    }
}
