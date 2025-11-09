package Operation;

public class Booking {
    private int bookingId;
    private String passenger;
    private String flight;
    //constructor
    public Booking(int bookingId, String passenger, String flight) {
        this.bookingId = bookingId;
        this.passenger = passenger;
        this.flight = flight;
    }
    //getter
    public int getBookingId() {
        return bookingId;
    }
    public String getPassenger() {
        return passenger;
    }
    public String getFlight() {
        return flight;
    }
    //setter
    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }
    public void setPassenger(String passenger) {
        this.passenger = passenger;
    }
    public void setFlight(String flight) {
        this.flight = flight;
    }
    public void bookFlight(){
        System.out.println("Book Flight\n Booking Id:"+bookingId+"\n Passenger name:"+passenger+"\n Flight:"+flight);
    }
    
}
