package Test2;

public class Gishushu{
    private int id;
    private String gishushuAddress;
    private String gishushuEmail;
    private String gishushuPhone;
    //constructor
    public Gishushu(String gishushuAddress, String gishushuEmail, String gishushuPhone) {
        this.gishushuAddress = gishushuAddress;
        this.gishushuEmail = gishushuEmail;
        this.gishushuPhone = gishushuPhone;
    }
    //getters and setters
    public String getGishushuAddress() {
        return gishushuAddress;
    }
    public void setGishushuAddress(String gishushuAddress) {
        if (gishushuAddress.isEmpty()||gishushuAddress.e) {
            System.out.println("Address is mandatory");
            
        }
        this.gishushuAddress = gishushuAddress;
    }
    public String getGishushuEmail() {
        return gishushuEmail;
    }
    public void setGishushuEmail(String gishushuEmail) {
        if (gishushuEmail.endsWith("@auca.com")) {
            //Do nothing            
        }else{
            System.out.println("Email shoud end with @auca.com");
        }
        this.gishushuEmail = gishushuEmail;
    }
    public String getGishushuPhone() {
        return gishushuPhone;
    }
    public void setGishushuPhone(String gishushuPhone) {
        if(gishushuPhone.endsWith("479")){
            //do nothing
        }else{
            System.out.println("Your phone number should end with 479.");
        }
        this.gishushuPhone = gishushuPhone;
    }
    
    
}
