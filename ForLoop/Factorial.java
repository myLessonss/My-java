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
        int prod=1;
        System.out.println("Finding Factorial of: "+number);
        for(int i=number;i>=1;i--){
            fact=(i);
            prod=fact*prod;
            System.out.println(fact);
        }
        System.out.println("Factorial of "+number+" : "+prod);

    }
}
