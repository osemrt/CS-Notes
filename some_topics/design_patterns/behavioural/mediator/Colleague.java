package mediator;

public abstract class Colleague {

    protected Mediator mediator;
    private String name;

    public Colleague(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName(){
        return name;
    }

    public abstract void send(String message);
    public abstract void receive(String senderName, String message);


}
