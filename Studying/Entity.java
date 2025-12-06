public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;
    //Constructors
    public Entity(int id, String creatDate, String updatedDate){
        this.id=id;
        this.createdDate=creatDate;
        this.updatedDate=updatedDate;
    }
    //Getters
    public int getid(){
        return id;
    }
    public String getcreatDate(){
        return createdDate;
    }
    public String getupdatedDate(){
        return updatedDate;
    }
    //Setters
    public void setid(int id){
        if (id<=0) {
            throw new IllegalArgumentException("Id must be greater than 0");
        }
        this.id=id;
    }
    public void setcreatedDate(String creatDate){
        if (creatDate==null) {
            throw new IllegalArgumentException("Date must not be Empty");
        }
        this.createdDate=creatDate;
    }
    public void setupdatedDate(String updatedDate){
        if (updatedDate==null) {
            throw new IllegalArgumentException("Date must not be Empty");
        }
    }
}
