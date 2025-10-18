//Read 10 numbers and find how many of them are positive, negative, or zero.
package ForLoop;
import java.util.Scanner;
public class CheckNuumber{
    public static void main(String[]args){
        int[] numbers= new int[10];
        Scanner numberScan=new Scanner(System.in);
        System.out.println("\nEnter in 10 numbers: ");
        for(int i=0;i<10;i++){
            numbers[i]=numberScan.nextInt();
        }
         System.out.println("Numbers inputed are:\n");
        for (int i=0;i<10;i++){
            System.out.print(numbers[i]);
            System.out.print(" ");

        }System.out.print("\nThe POSITIVE numbers entered are: ");
        for (int i=0;i<10;i++){
            if(numbers[i]>0){
                System.out.print(numbers[i]);
                System.out.print(" ");
            }
        }
        System.out.print("\nThe NEGATIVE numbers entered are: ");
        for (int i=0;i<10;i++){
            if(numbers[i]<0){
                System.out.print(numbers[i]);
                System.out.print(" ");
            }
        }
        System.out.print("\nThe ZERO numbers entered are: ");
        for (int i=0;i<10;i++){
            if(numbers[i]==0){
                System.out.print(numbers[i]);
                System.out.print(" ");
            }
        }

    }
}