package Test2;

public class Faculty extends Gishushu{    
    private int facultyId;
    private String facultyName;
    //constructors
    public Faculty(int id, String gishushuAddress, String gishushuEmail, String gishushuPhone, int facultyId,
            String facultyName) {
        super(id, gishushuAddress, gishushuEmail, gishushuPhone);
        this.facultyId = facultyId;
        this.facultyName = facultyName;
    }
    //getters and setters
    
    public void getFacultyName(){
        //allow on IM,SE,NT
        System.out.println("Software Engineering");
    }

    public int getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(int facultyId) {
        if (facultyId!=1) {
            System.out.println("We have only one faculty do id should be always 1.");            
        }
        this.facultyId = facultyId;
    }

    public void setFacultyName(String facultyName) {
        //if((facultyName.equals("IM"))||(facultyName.equals("SE"))||(facultyName.equals("NT")))
        if (facultyName=="IM"||facultyName=="SE"||facultyName=="NT") {
            System.out.println("we only have faculty named IM and NT and SE");            
        }
        this.facultyName = facultyName;
    }
}
