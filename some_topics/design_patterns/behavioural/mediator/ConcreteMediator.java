package mediator;

import java.util.ArrayList;

public class ConcreteMediator implements Mediator {

    ArrayList<Colleague> colleagues;

    public ConcreteMediator() {
        this.colleagues = new ArrayList<>();
    }

    @Override
    public void sendMessage(Colleague sender, String message) {
        for(Colleague colleague : colleagues){
            if(!colleague.getName().equalsIgnoreCase(sender.getName())){
                colleague.receive(sender.getName(), message);
            }
        }
    }

    @Override
    public void register(Colleague colleague) {
        colleagues.add(colleague);
    }
}
