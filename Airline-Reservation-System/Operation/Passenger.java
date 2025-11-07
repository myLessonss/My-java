package Operation;
public class Passenger {
    private int contactNumberPassenger;
    private String emailPassenger;
    public Passenger(int contactNumberPassenger, String emailPassenger) {
        this.contactNumberPassenger = contactNumberPassenger;
        this.emailPassenger = emailPassenger;
    }
    public int getContactNumberPassenger() {
        return contactNumberPassenger;
    }
    public void setContactNumberPassenger(int contactNumberPassenger) {
        this.contactNumberPassenger = contactNumberPassenger;
    }
    public String getEmailPassenger() {
        return emailPassenger;
    }
    public void setEmailPassenger(String emailPassenger) {
        this.emailPassenger = emailPassenger;
    }
    
}
