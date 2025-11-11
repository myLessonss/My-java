public class Person {
    private String name;
    private int id;
    private int age;
    private String email;
    private String gender;
    private String address;

    // Simple setters for normal variables
    public void setName(String name) { this.name = name; }
    public void setGender(String gender) { this.gender = gender; }
    public void setAddress(String address) { this.address = address; }

    // Validated setters
    public void setId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("ID must be positive.");
        }
        this.id = id;
    }

    public void setAge(int age) {
        if (age < 18 || age > 120) {
            throw new IllegalArgumentException("Age must be between 18 and 120.");
        }
        this.age = age;
    }

    public void setEmail(String email) {
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Invalid email address, Email must contain @.");
        }
        this.email = email;
    }

    // For checking later
    public void display() {
        System.out.println("\nUser Information:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
    }
}
