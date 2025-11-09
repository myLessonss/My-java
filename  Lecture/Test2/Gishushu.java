package Test2;

public class Gishushu{
    private int id;
    private String gishushuAddress;
    private String gishushuEmail;
    private String gishushuPhone;
    //constructor
    public Gishushu(int id, String gishushuAddress, String gishushuEmail, String gishushuPhone) {
        this.id = id;
        this.gishushuAddress = gishushuAddress;
        this.gishushuEmail = gishushuEmail;
        this.gishushuPhone = gishushuPhone;
    }
    //getters and setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getGishushuAddress() {
        return gishushuAddress;
    }
    public void setGishushuAddress(String gishushuAddress) {
        this.gishushuAddress = gishushuAddress;
    }
    public String getGishushuEmail() {
        return gishushuEmail;
    }
    public void setGishushuEmail(String gishushuEmail) {
        this.gishushuEmail = gishushuEmail;
    }
    public String getGishushuPhone() {
        return gishushuPhone;
    }
    public void setGishushuPhone(String gishushuPhone) {
        this.gishushuPhone = gishushuPhone;
    }
    
    
}
