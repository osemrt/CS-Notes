package state;

public class OffState implements State {


    private final Context context;

    public OffState(Context context) {
        this.context = context;
    }


    @Override
    public void display() {
        System.out.println("in OFF");
    }


    @Override
    public void transitionTo(State state) {
        context.setCurrentState(state);
    }
}
