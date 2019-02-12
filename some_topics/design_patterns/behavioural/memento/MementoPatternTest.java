package memento;

public class MementoPatternTest {

    public static void main(String[] args) {


        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator();


        originator.setState("State #0");
        careTaker.addMemento(originator.save());
        printState(originator);

        originator.setState("State #1");
        careTaker.addMemento(originator.save());
        printState(originator);

        originator.setState("State #2");
        careTaker.addMemento(originator.save());
        printState(originator);

        originator.setState("State #3");
        careTaker.addMemento(originator.save());
        printState(originator);

        originator.setState("State #4");
        careTaker.addMemento(originator.save());
        printState(originator);

        originator.setState("State #5");
        careTaker.addMemento(originator.save());
        printState(originator);


        System.out.println("--------------------------");

        originator.restore(careTaker.undo());
        printState(originator);

        originator.restore(careTaker.undo());
        printState(originator);

        originator.restore(careTaker.redo());
        printState(originator);

        originator.setState("State #10");
        careTaker.addMemento(originator.save());
        printState(originator);

        originator.restore(careTaker.redo());
        printState(originator);

        originator.restore(careTaker.undo());
        printState(originator);

        careTaker.addMemento(originator.save());
        originator.restore(careTaker.undo());
        printState(originator);


    }

    private static void printState(Originator originator) {
        System.out.println("Current State : " + originator.getState());
    }

}
