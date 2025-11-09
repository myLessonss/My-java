package Operation;

public class Booking {
    private int bookingId;
    private String passenger;
    private String flight;
    public Booking(int bookingId, String passenger, String flight) {
        this.bookingId = bookingId;
        this.passenger = passenger;
        this.flight = flight;
    }
    public int getBookingId() {
        return bookingId;
    }
    public String getPassenger() {
        return passenger;
    }
    public String getFlight() {
        return flight;
    }
    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }
    public void setPassenger(String passenger) {
        this.passenger = passenger;
    }
    public void setFlight(String flight) {
        this.flight = flight;
    }
    
}
