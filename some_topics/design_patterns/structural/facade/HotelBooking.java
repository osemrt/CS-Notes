package facade;

public class HotelBooking implements Bookable {
    @Override
    public void book() {
        System.out.println("Hotel booking was created successfully.");
    }
}
