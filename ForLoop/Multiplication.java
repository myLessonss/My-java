//Print the multiplication table of any number entered by the user
package ForLoop;
import java.util.Scanner;
public class Multiplication {
    public static void main(String [] args){
        int number;
        Scanner myscan=new Scanner(System.in);
        System.out.println("\nEnter in a number: ");
        number=myscan.nextInt();
        System.out.println("Multiplication of "+number);
        for(int i=1;i<=10;i++){
            System.out.println(i+" X "+number+" = "+i*number);
        }
    }
    
}
