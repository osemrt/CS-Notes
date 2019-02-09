package facade;

public class FlightBooking implements Bookable {
    @Override
    public void book() {
        System.out.println("Flight booking was created successfully.");
    }
}
