package command.invokers;

import command.commands.Command;
import command.receivers.Receiver;

public class DeviceButtons extends Invoker {

    public DeviceButtons(Command on, Command off, Command volumeUp, Command volumeDown) {
        super(on, off, volumeUp, volumeDown);
    }

    @Override
    public void on() {
        this.on.execute();
    }

    @Override
    public void off() {
        this.off.execute();
    }

    @Override
    public void volumeUp() {
        this.volumeUp.execute();
    }

    @Override
    public void volumeDown() {
        this.volumeDown.execute();
    }
}
