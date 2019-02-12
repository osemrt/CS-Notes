package state;

import java.util.HashMap;
import java.util.Map;

public class Context {

    private State currentState;
    private Map<State, State> stateStateHashMap;

    public Context() {

        State offState = new OffState(this);
        State onState = new OnState(this);

        stateStateHashMap = new HashMap<>();
        this.stateStateHashMap.put(offState, onState);
        this.stateStateHashMap.put(onState, offState);

        this.currentState = offState;

    }

    public void setCurrentState(State state) {
        this.currentState = state;
    }

    public void display(){
        this.currentState.display();
    }

    public void toggle(){
        this.currentState.transitionTo(stateStateHashMap.get(currentState));
    }

}
