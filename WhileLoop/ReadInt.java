package WhileLoop;
import java.util.Scanner;
//Read integers repeatedly and stop when the user enters 0
public class ReadInt {
    public static void main(String[]args){
        Scanner myscan = new Scanner(System.in);
        int num;
        System.out.println("\n Enter in the number: ");
        num=myscan.nextInt();
        while(num!=0){
            num=myscan.nextInt();
        }
    }
}
