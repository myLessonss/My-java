package Test2;

public class Department extends Faculty{
    private int deptId;public Department(int id, String gishushuAddress, String gishushuEmail, String gishushuPhone, int facultyId,
            String facultyName, int deptId, String deptName) {
        super(id, gishushuAddress, gishushuEmail, gishushuPhone, facultyId, facultyName);
        this.deptId = deptId;
        this.deptName = deptName;
    }

    private String deptName;
    

    public void getFacultyName(){
        System.out.println("Software Engineering");
    }
}
