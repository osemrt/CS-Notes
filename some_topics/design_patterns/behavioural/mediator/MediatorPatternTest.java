package mediator;

public class MediatorPatternTest {
    public static void main(String[] args) {

        Mediator mediator = new ConcreteMediator();

        Colleague colleagueA = new ColleagueA("A", mediator);
        Colleague colleagueB = new ColleagueB("B", mediator);
        Colleague colleagueC = new ColleagueC("C", mediator);

        mediator.register(colleagueA);
        mediator.register(colleagueB);
        mediator.register(colleagueC);

        colleagueA.send("Hi, all!");
        colleagueB.send("Hi!");
        colleagueC.send("Asd");



    }
}
