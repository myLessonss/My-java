package Operation;
public class Flight{
    private int flightNumber;
    private String flightDestination;
    private String flightFare;
    private int availableSeats;
    //constuctor
    public Flight(int flightNumber, String flightDestination, String flightFare, int availableSeats) {
        this.flightNumber = flightNumber;
        this.flightDestination = flightDestination;
        this.flightFare = flightFare;
        this.availableSeats = availableSeats;
    }
    //getters and setterrs
    public int getFlightNumber() {
        return flightNumber;
    }
    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }
    public String getFlightDestination() {
        return flightDestination;
    }
    public void setFlightDestination(String flightDestination) {
        this.flightDestination = flightDestination;
    }
    public String getFlightFare() {
        return flightFare;
    }
    public void setFlightFare(String flightFare) {
        this.flightFare = flightFare;
    }
    public int getAvailableSeats() {
        return availableSeats;
    }
    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }
    
}
