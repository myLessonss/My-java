package Operation;

public class User {
    private String userName;
    private int userId;
    public User(String userName, int userId) {
        this.userName = userName;
        this.userId = userId;
    }
    public String getuserName() {
        return userName;
    }
    public int getuserId() {
        return userId;
    }
    public void setuserName(String userName) {
        this.userName = userName;
    }
    public void setuserId(int userId) {
        this.userId = userId;
    }

    
}
