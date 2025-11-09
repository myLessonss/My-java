package Test2;

public class Student extends Department {
    private int idNumber;
    private String name;
    private int age;
    private String gender;
    private String address;
    private String phone;
    private String major;
    //contructor
    public Student(String gishushuAddress, String gishushuEmail, String gishushuPhone, int facultyId,
            String facultyName, int deptId, String deptName, int idNumber, String name, int age, String gender,
            String address, String phone, String major) {
        super(gishushuAddress, gishushuEmail, gishushuPhone, facultyId, facultyName, deptId, deptName);
        this.idNumber = idNumber;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
        this.major = major;
    }
    //getters and setters
    public int getIdNumber() {
        return idNumber;
    }
    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age<18){
            System.out.println("Age must be greater than 18");
        }
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        if (gender=="male"&& gender=="female") {
            System.out.println("Gender must be male or female");            
        }
        this.gender = gender;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    

    
}
