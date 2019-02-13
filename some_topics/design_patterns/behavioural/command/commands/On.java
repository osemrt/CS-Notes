package command.commands;

import command.receivers.Receiver;

public class On implements Command{

    private final Receiver receiver;

    public On(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.on();
    }

    @Override
    public void undo() {
        receiver.off();
    }
}
