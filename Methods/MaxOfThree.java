package Methods;
//Create a method maxOfThree(int a, int b, int c) that returns the largest number
import java.util.Scanner;
public class MaxOfThree {
    public void maxOfThree(int a, int b, int c){
        if(a>b && a>c){
            System.out.println("MAXIMUM= "+a);
        }else if(b>a && b>c){
            System.out.println("MAXIMUM= "+b);
        }else if(c>a && c>b){
            System.out.println("MAXIMUM= "+c);
        }else{
            System.out.println("THE ARE EQUAL");
        }
    }
    public  static void main(String[]args){
        Scanner myscan=new Scanner(System.in);
        MaxOfThree myobj=new MaxOfThree();
        System.out.println("\nEnter in 1 numbers to check:");
        int fnum=myscan.nextInt();
        System.out.println("\nEnter in 2 numbers to check:");
        int snum=myscan.nextInt();
        System.out.println("\nEnter in 3 numbers to check:");
        int tnum=myscan.nextInt();
        myobj.maxOfThree(fnum, snum, tnum);
        

    }
    
}
