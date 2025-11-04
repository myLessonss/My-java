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
        myobj.display();
        //withdrawing money 
        System.out.println("Enter in amount you want to withdraw: ");
        double withdrawAmount=scn.nextDouble();
        System.out.println("Enter in your balance: ");
        double balance=scn.nextDouble();
        Withdraw withdrawObj=new Withdraw(id, withdrawAmount, balance);
        withdrawObj.withdraw();
        System.out.println("Enter in your approved amount: ");
        double approvedAmount=scn.nextDouble();
        System.out.println("Enter in the amount of loan u want: ");
        double loan=scn.nextDouble();
        Loan myloan=new Loan();
        double b=myloan.getApprovedAmount();
        System.out.println(b);
    }
}
