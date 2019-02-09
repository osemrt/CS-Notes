package facade;

public class TravelPackage implements Bookable {


    private final FlightBooking flightBooking;
    private final HotelBooking hotelBooking;
    private final TransferBooking transferBooking;

    public TravelPackage() {
        this.flightBooking = new FlightBooking();
        this.hotelBooking = new HotelBooking();
        this.transferBooking = new TransferBooking();
    }

    @Override
    public void book() {
        this.flightBooking.book();
        this.hotelBooking.book();
        this.transferBooking.book();

        System.out.println("Travel package booked successfully.");

    }
}
