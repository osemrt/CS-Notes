package command.commands;

import command.receivers.Receiver;

import java.util.ArrayList;

public class OnAll implements Command {

    ArrayList<Receiver> receivers;

    public OnAll(ArrayList<Receiver> receivers) {
        this.receivers = receivers;
    }

    @Override
    public void execute() {
        for(Receiver receiver : receivers){
            receiver.on();
        }

    }

    @Override
    public void undo() {
        for(Receiver receiver : receivers){
            receiver.off();
        }

    }
}
