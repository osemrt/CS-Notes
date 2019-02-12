package templatemethod;

public class StoreOrder extends Template {
    @Override
    public void deliver() {
        System.out.println("Item delivered to in delivery counter.");
    }

    @Override
    public void pay() {
        System.out.println("Pays at counter through cash/POS");
    }

    @Override
    public void select() {
        System.out.println("Customer chooses the item from shelf.");
    }
}
