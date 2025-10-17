//Enter three numbers and print the greatest using nested if.
import java.util.Scanner;
public class Max {
    public static void main(String [] args){
        int number1,number2,number3,max;
        Scanner maximumScanner=new Scanner(System.in);
        System.out.print("\nEnter in 1 Number: ");
        number1=maximumScanner.nextInt();
        System.out.print("\nEnter in 2 Number: ");
        number2=maximumScanner.nextInt();
        System.out.print("\nEnter in 3 Number: ");
        number3=maximumScanner.nextInt();
        max=number1;
        if (number2>max){
            max=number2;
            if (number3>max){
                max=number3;
            }
        }
        if(number3>max){
            max=number3;
                        
        }
        System.out.println(max);

    }
}
