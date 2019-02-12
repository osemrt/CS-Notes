package state;

public interface State {

    public void display();
    public void transitionTo(State state);

}
