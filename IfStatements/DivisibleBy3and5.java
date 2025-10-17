//Read a number and check if it’s divisible by both 3 and 5
import java.util.Scanner;
public class DivisibleBy3and5 {
    public static void main(String[]args){
        int number;
        Scanner myscan=new Scanner(System.in);
        System.out.println("\nEnter in a number: ");
        number=myscan.nextInt();
        if (number%3==0 && number%5==0){
            System.out.println("THIS NUMBER IS DEVIIBLE BY 3 AND 5");
        }else{
            System.out.println("THIS NUMBER IS NOT DIVISIBLE BY 3 AND 5");
        }
    }
}
