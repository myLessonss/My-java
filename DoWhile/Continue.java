package DoWhile;
//Continuously ask the user to enter a number and stop when they enter a negative one.
import java.util.Scanner;
public class Continue {
    public static void main(String []args){
        Scanner myscan =new Scanner(System.in);
        int  number;
        System.out.println("\nEnter in a number:");
        do{
            number=myscan.nextInt();
        }while(number>=0);
        
    }
}
