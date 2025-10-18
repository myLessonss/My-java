//Calculate the factorial of a number entered by the user.
package ForLoop;
import java.util.Scanner;
public class Factorial {
    public static void main(String[]args){
        int number;
        Scanner myscan=new Scanner(System.in);
        System.out.println("\nEnter in a number: ");
        number=myscan.nextInt();
        int fact=1;
        int sum=0;
        System.out.println("Finding Factorial of: "+number);
        for(int i=number;i>0;--i){
            fact=number*(i-1);
            sum+=fact;
            System.out.println(fact);
        }
        System.out.println("Factorial of "+number+" : "+sum);

    }
}
