//Input a person’s age and determine if they are eligible to vote (18+).
import java.util.Scanner;
public class Vote{
    public static void main(String[]args){
        int years;
        Scanner myscanner=new Scanner(System.in);
        System.out.print("\nHow Old Are You: ");
        years=myscanner.nextInt();
        if(years>18){
            System.out.println("You are Eligble to VOTE.");
        }else{
            System.out.println("You are NOT Eligble to VOTE");
        }
        myscanner.close();
    }
}
