package command.commands;

import command.receivers.Receiver;

public class Off implements Command {
    private final Receiver receiver;

    public Off(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.off();
    }

    @Override
    public void undo() {
        receiver.on();
    }
}
