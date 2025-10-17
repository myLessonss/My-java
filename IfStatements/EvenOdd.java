//Read an integer and check if it’s even or odd using an if condition
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[]args){
        int number;
        Scanner a=new Scanner(System.in);
        System.out.println("\n Enter in a number: ");
        number=a.nextInt();
        if(number%2==0){
            System.out.println("EVEN");
        }else{
            System.out.println("ODD");
        }
    }
    
}
