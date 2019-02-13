package command.commands;

import command.receivers.Receiver;

public class VolumeDown implements Command {
    private final Receiver receiver;

    public VolumeDown(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.volumeDown();
    }

    @Override
    public void undo() {
        receiver.volumeUp();
    }
}
