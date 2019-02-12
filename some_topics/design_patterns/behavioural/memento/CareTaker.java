package memento;

import java.util.ArrayList;

public class CareTaker {

    private ArrayList<Memento> mementoArrayList;
    private int currentState = -1;

    public CareTaker() {
        this.mementoArrayList = new ArrayList<>();
    }

    public void addMemento(Memento memento){
        mementoArrayList.add(memento);
        currentState = mementoArrayList.size()-1;
    }

    private Memento getMemento() {
        return mementoArrayList.get(this.currentState);
    }

    public Memento undo(){
        System.out.println("Undoing state...");
        if(this.currentState<=0){
            this.currentState = 0;
        }else{
            this.currentState--;
        }

        return getMemento();
    }

    public Memento redo(){
        System.out.println("Redoing state...");
        if(this.currentState>=mementoArrayList.size()-1){
            this.currentState = mementoArrayList.size()-1;
        }else{
            this.currentState++;
        }

        return getMemento();
    }

}