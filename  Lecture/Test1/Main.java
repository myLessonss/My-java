import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter in your id: ");
        int id=scn.nextInt();
        System.out.println("Enter in your approved amount: ");
        double approvedAmount=scn.nextDouble();
        System.out.println("Enter in the amount of loan u want: ");
        double loan=scn.nextDouble();
        Loan myloan=new Loan();
        double b=myloan.getApprovedAmount();
        System.out.println(b);
    }
}
