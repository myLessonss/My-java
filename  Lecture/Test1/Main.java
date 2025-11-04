import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner scn=new Scanner(System.in);
        //Declare the object from class User
        System.out.print("Enter in your id: "); 
        int id=scn.nextInt();
        scn.nextLine();
        System.out.print("Enter in your name: ");
        String name=scn.nextLine();
        User myobj=new User(id, name);
        System.out.println("The user deatils are:\n Id:"+id+" \nName:"+name);
        System.out.println("Enter in your approved amount: ");
        double approvedAmount=scn.nextDouble();
        System.out.println("Enter in the amount of loan u want: ");
        double loan=scn.nextDouble();
        Loan myloan=new Loan();
        double b=myloan.getApprovedAmount();
        System.out.println(b);
    }
}
