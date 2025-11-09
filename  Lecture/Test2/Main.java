package Test2;

import java.util.Scanner;

public class Main {
   public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the campus address");
      String campusAddress=sc.nextLine();
      System.out.println("Enter the campus Email");
      String campusEmail=sc.nextLine();
      System.out.println("Enter in campus phone");
      String phone=sc.nextLine();
      System.out.println("Enter in Faculty Id: ");
      int fId=sc.nextInt();
      System.out.println("Enter in Faculty name: ");
      String fname=sc.nextLine();
      sc.nextLine();
      System.out.println("Enter in Department id: ");
      int deptId=sc.nextInt();
      System.out.println("Enter in Department name: ");
      String deptname=sc.nextLine();
      sc.nextLine();
      System.out.println("Enter in student id: ");
      int studentID=sc.nextInt();
      System.out.println("Enter in Student name: ");
      String studentName=sc.nextLine();
      sc.nextLine();
      System.out.println("Enter in student age: ");
      int studentAge=sc.nextInt();
      System.out.println("Enter in Student gender: ");
      String studentGender=sc.nextLine();
      sc.nextLine();
      System.out.println("Enter in Student Address: ");
      String studentAddress=sc.nextLine();
      System.out.println("Enter in Student Phone number: ");
      String studentPhoneNumber=sc.nextLine();
      System.out.println("Enter in Student major: ");
      String studentMajor=sc.nextLine();
      Student student=new Student(campusAddress,campusEmail,phone,fId,fname,deptId,deptname,studentID,studentName,studentAge,studentGender,studentAddress,studentPhoneNumber,studentMajor);
      
   }
}
