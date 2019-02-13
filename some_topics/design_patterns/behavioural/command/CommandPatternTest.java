package command;

import command.commands.*;
import command.invokers.DeviceButtons;
import command.invokers.Invoker;
import command.receivers.Receiver;

import java.util.ArrayList;

public class CommandPatternTest {

    public static void main(String[] args) {

        Receiver receiver1 = ReceiverFactory.getReceiver(ReceiverType.Television);
        Receiver receiver2 = ReceiverFactory.getReceiver(ReceiverType.Radio);

        ArrayList<Receiver> receivers = new ArrayList<>();
        receivers.add(receiver1);
        receivers.add(receiver2);

        Command command1 = new OffAll(receivers);
        Command command2 = new OnAll(receivers);

        Command command3 = new On(receiver1);
        Command command4 = new Off(receiver1);
        Command command5 = new VolumeDown(receiver1);
        Command command6 = new VolumeUp(receiver1);

        Command command7 = new On(receiver2);
        Command command8 = new Off(receiver2);
        Command command9 = new VolumeDown(receiver2);
        Command command10 = new VolumeUp(receiver2);


        Invoker invoker = new DeviceButtons(command3, command4, command6, command5);
        invoker.on();
        invoker.off();
        invoker.volumeUp();
        invoker.volumeDown();

        command1.execute();
        command2.execute();

        command7.execute();
        command8.execute();
        command9.undo();
        command10.undo();

    }


}
