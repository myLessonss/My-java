//Input marks of a student and print “Pass” if ≥ 50 else “Fail”
import java.util.Scanner;
public class Marks{
    public static void main(String[]args){
        double mark;
        Scanner b=new Scanner(System.in);
        System.out.println("\nEnter in your marks: ");
        mark=b.nextDouble();
        if(mark>=50){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

    }
}