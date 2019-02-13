package mediator;

public interface Mediator {
    public void sendMessage(Colleague sender, String message);
    public void register(Colleague colleague);

}
