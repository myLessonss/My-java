
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        // title
        JFrame frame=new JFrame("Student Registration Form");

        JPanel panel=new JPanel();
        panel.setLayout(new GridLayout(20,2,20,10));

        //labels
        JLabel studentIdLabel=new JLabel("Student ID: ");
        JTextField studentId=new JTextField();

        JLabel firstnameLabel=new JLabel("First name: ");
        JTextField firstname=new JTextField();

        JLabel lastnameLabel=new JLabel("Last name: ");
        JTextField lastname=new JTextField();

        JLabel emailAddressLabel=new JLabel("Email Address: ");
        JTextField emailAddress=new JTextField();

        JLabel phoneNumberLabel=new JLabel("Phone number: ");
        JTextField phoneNumber=new JTextField();

        JLabel addressLabel=new JLabel("Address: ");
        JTextField address=new JTextField();

        JLabel genderLabel=new JLabel("Gender: ");
        JRadioButton maleButton=new JRadioButton("Male");
        JLabel femaleLabel=new JLabel();
        JRadioButton femaleButton=new JRadioButton("Female");

        JLabel departmentLabel=new JLabel("Department");
        String [] department={"Computer Science","Software Engineering","Information Technology","Networking","Business Information Technology"};
        JComboBox<String> departmentCombo=new JComboBox<String>(department);

        JLabel yearLabel=new JLabel("Year");
        String [] year={"Year 1","Year 2","Year 3","Year 4"};
        JComboBox<String>yearCombo=new JComboBox<String>(year);

        JLabel javaLabel=new JLabel("Java Programming");
        JCheckBox java = new JCheckBox();
        JLabel webLabel=new JLabel("Web Development");
        JCheckBox web = new JCheckBox();
        JLabel databaseLabel=new JLabel("Database Systems");
        JCheckBox database = new JCheckBox();
        JLabel netLabel=new JLabel("Networking");
        JCheckBox net = new JCheckBox();
        JLabel mobileLabel=new JLabel("Mobile Development");
        JCheckBox mobile = new JCheckBox();

        //group button
        ButtonGroup group=new ButtonGroup();
        group.add(maleButton);
        group.add(femaleButton);

        //buttons
        JLabel saveLabel=new JLabel();
        JButton saveButton=new JButton("Save");
        JLabel resetLabel=new JLabel();
        JButton resetButton=new JButton("Reset");
        JLabel exitLabel=new JLabel();
        JButton exitButton=new JButton("Exit");


        //Add label to panel
        panel.add(studentIdLabel);
        panel.add(studentId);
        panel.add(firstnameLabel);
        panel.add(firstname);
        panel.add(lastnameLabel);
        panel.add(lastname);
        panel.add(emailAddressLabel);
        panel.add(emailAddress);
        panel.add(phoneNumberLabel);
        panel.add(phoneNumber);
        panel.add(addressLabel);
        panel.add(address);
        panel.add(genderLabel);
        panel.add(maleButton);
        panel.add(femaleLabel);
        panel.add(femaleButton);
        panel.add(departmentLabel);
        panel.add(departmentCombo);
        panel.add(yearLabel);
        panel.add(yearCombo);
        panel.add(javaLabel);
        panel.add(java);
        panel.add(webLabel);
        panel.add(web);
        panel.add(databaseLabel);
        panel.add(database);
        panel.add(netLabel);
        panel.add(net);
        panel.add(mobileLabel);
        panel.add(mobile);

        panel.add(saveLabel);
        panel.add(saveButton);
        panel.add(resetLabel);
        panel.add(resetButton);
        panel.add(exitLabel);
        panel.add(exitButton);

        frame.add(panel);
        frame.setSize(500,600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}