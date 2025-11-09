package Test2;

public class Department extends Faculty{
    private int deptId;
    private String deptName;
    //constructors
    public Department(int id, String gishushuAddress, String gishushuEmail, String gishushuPhone, int facultyId,
            String facultyName, int deptId, String deptName) {
        super(id, gishushuAddress, gishushuEmail, gishushuPhone, facultyId, facultyName);
        this.deptId = deptId;
        this.deptName = deptName;
    }  
    //getters and setters
    public void getFacultyName(){
        System.out.println("Software Engineering");
    }


    public int getDeptId() {
        return deptId;
    }


    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }


    public String getDeptName() {
        return deptName;
    }


    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
