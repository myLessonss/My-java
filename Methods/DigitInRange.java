package Methods;
/*Write a method sumOfDigitsInRange(int start, int end) that calculates the total sum
of all digits from every number between start and end (inclusive).If start > end,
swap the values. Example: for range 12 to 15 → (1+2) + (1+3) + (1+4) + (1+5) =
16 
 */
import java.util.Scanner;
public class DigitInRange {
    public void sumOfDigitsInRange(int start, int end){
        int swap;
        int total=0;
        int digit;
        if(start>end){
            swap=start;
            start=end;
            end=swap;
        }
        for(int i=start;i<=end;i++){
            int num=i;
            while(num>0){
                digit=num%10;
                total=digit+total;
                num/=10;
            }  
        }
        System.out.println(total);
        
    }
    public static void main(String[]args){
        Scanner myscan=new Scanner(System.in);
        DigitInRange myobj=new DigitInRange();
        System.out.println("\n Enter in Starting number: ");
        int starting=myscan.nextInt();
        System.out.println("Enter in Ending number: ");
        int ending=myscan.nextInt();
        System.out.println("The  answer is: ");
        myobj.sumOfDigitsInRange(starting,ending);

    }
}
