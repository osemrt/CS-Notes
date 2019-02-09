package facade;

public class TransferBooking implements Bookable {
    @Override
    public void book() {
        System.out.println("Transfer booking was created successfully.");
    }
}
