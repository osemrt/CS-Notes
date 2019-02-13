package command.commands;

import command.receivers.Receiver;

import java.util.ArrayList;

public class OffAll implements Command {

    ArrayList<Receiver> receivers;

    public OffAll(ArrayList<Receiver> receivers) {
        this.receivers = receivers;
    }

    @Override
    public void execute() {
        for(Receiver receiver : receivers){
            receiver.off();
        }
    }

    @Override
    public void undo() {
        for(Receiver receiver : receivers){
            receiver.on();
        }
    }
}
