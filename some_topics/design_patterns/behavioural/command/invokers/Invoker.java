package command.invokers;

import command.commands.Command;

public abstract class Invoker {
    protected final Command on;
    protected final Command off;
    protected final Command volumeUp;
    protected final Command volumeDown;

    public Invoker(Command on, Command off, Command volumeUp, Command volumeDown) {
        this.on = on;
        this.off = off;
        this.volumeUp = volumeUp;
        this.volumeDown = volumeDown;
    }

    public abstract void on();
    public abstract void off();
    public abstract void volumeUp();
    public abstract void volumeDown();

}
