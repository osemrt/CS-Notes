package command.receivers;

public interface Receiver {
    public void on();
    public void off();
    public void volumeUp();
    public void volumeDown();
}
