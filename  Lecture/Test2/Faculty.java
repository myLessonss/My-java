package Test2;

public class Faculty extends Gishushu{
    public Faculty(int id, String gishushuAddress, String gishushuEmail, String gishushuPhone, int facultyId,
            String facultyName) {
        super(id, gishushuAddress, gishushuEmail, gishushuPhone);
        this.facultyId = facultyId;
        this.facultyName = facultyName;
    }

    private int facultyId;
    private String facultyName;
    public void getFacultyName(){
        System.out.println("Software Engineering");
    }
}
