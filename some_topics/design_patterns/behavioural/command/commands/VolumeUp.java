package command.commands;

import command.receivers.Receiver;

public class VolumeUp implements Command{

    private final Receiver receiver;

    public VolumeUp(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.volumeUp();
    }

    @Override
    public void undo() {
        receiver.volumeDown();
    }
}
