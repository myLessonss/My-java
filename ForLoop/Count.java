//Count how many digits are in a given number.
package ForLoop;
import java.util.Scanner;
public class Count {
    public static void main(String[]args){
        Scanner myscan=new Scanner(System.in);
        int number;
        int length;
        int reversedNum=0;
        int digit;
        System.out.println("Enter in a number: ");
        number=myscan.nextInt();
        String len=String.valueOf(number);
        length=len.length();
        for (int i=1;i<=length;i++){
            digit=number%10;
            reversedNum=reversedNum*10+digit;
            number/=10;
        }
        System.out.println(reversedNum);

    }
}
