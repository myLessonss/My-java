package Operation;

public class User {
    private String userName;
    private int userId;
    private String staffPostion;
    //constructor
    public User(String userName, int userId, String staffPostion) {
        this.userName = userName;
        this.userId = userId;
        this.staffPostion=staffPostion;
    }
    //getters
    public String getuserName() {
        return userName;
    }
    public int getuserId() {
        return userId;
    }
    public String getstaffpostion(){
        return staffPostion;
    }

    //setters
    public void setuserName(String userName) {
        this.userName = userName;
    }
    public void setuserId(int userId) {
        this.userId = userId;
    }
    public void setstaffPostion(){
        this.staffPostion=staffPostion;
    }
    //register passenger
    public void registerPassenger(){
        System.out.println("User Details\n Name: "+userName+"\n Id: "+userId);
        
    }
    //register staff member
    public void registerStaff(){
        System.out.println("Staff Detail\n Name: "+userName+"\n Id: "+userId+"\n Postion: "+staffPostion);
    }

    
}
