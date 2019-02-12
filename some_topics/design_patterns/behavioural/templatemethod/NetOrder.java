package templatemethod;

public class NetOrder extends Template {

    @Override
    public void deliver() {
        System.out.println("Ship the item through post to delivery address");
    }

    @Override
    public void pay() {
        System.out.println("Online Payment through Netbanking, card or Paytm");
    }

    @Override
    public void select() {
        System.out.println("Item added to online shopping cart");
        System.out.println("Get gift wrap preference");
        System.out.println("Get delivery address.");

    }

    public void abc(){
        System.out.println("asd");
    }

}
