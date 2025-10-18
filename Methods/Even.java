//Write a method isEven(int n) that returns true if n is even.
package Methods;
import java.util.Scanner;
public class Even {
    public void isEven(int n){
        if(n%2==0){
            System.out.println(true);;
        }
    } 
    public static void main(String[]args){
        Scanner myscan=new Scanner(System.in);
        System.out.println("Enter in a number to check: ");
        int number=myscan.nextInt();
        Even myObject=new Even();
        myObject.isEven(number);

    }   
}
