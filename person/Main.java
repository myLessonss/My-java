import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Person person = new Person();

        System.out.print("Enter name: ");
        person.setName(scan.nextLine());  // simple input

        // Validation loop for ID
        boolean valid = false;
        while (!valid) {
            try {
                System.out.print("Enter ID: ");
                int id = scan.nextInt();
                person.setId(id);
                valid = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        // Validation loop for Age
        valid = false;
        while (!valid) {
            try {
                System.out.print("Enter age: ");
                int age = scan.nextInt();
                person.setAge(age);
                valid = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        scan.nextLine(); // clear newline

        // Validation loop for Email
        valid = false;
        while (!valid) {
            try {
                System.out.print("Enter email: ");
                String email = scan.nextLine();
                person.setEmail(email);
                valid = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        // Regular inputs again
        System.out.print("Enter gender: ");
        person.setGender(scan.nextLine());

        System.out.print("Enter address: ");
        person.setAddress(scan.nextLine());

        // Show all data
        person.display();
        scan.close();
    }
}
