package mediator;

public class ColleagueB extends Colleague {

    public ColleagueB(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void send(String message) {
        this.mediator.sendMessage(this, message);
    }

    @Override
    public void receive(String senderName, String message) {
        System.out.println(senderName + " -> " + this.getName() + " : " + message);
    }
}
