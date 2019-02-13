package command;

import command.receivers.Radio;
import command.receivers.Receiver;
import command.receivers.Television;

public class ReceiverFactory {

    public static Receiver getReceiver(ReceiverType receiverType){

        Receiver receiver;

        switch (receiverType){
            case Television:
                receiver = new Television();
                break;
            case Radio:
                receiver = new Radio();
                break;
            default:
                receiver = null;
        }

        return receiver;

    }

}
