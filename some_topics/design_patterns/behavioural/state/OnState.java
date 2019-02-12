package state;

public class OnState implements State {

    private final Context context;

    public OnState(Context context) {
        this.context = context;
    }


    @Override
    public void display() {
        System.out.println("in ON");
    }

    @Override
    public void transitionTo(State state) {
        this.context.setCurrentState(state);
    }
}
