import java.util.Scanner;
import operations.Add;
import operations.Divide;
import operations.Minus;
import operations.Product;
public class Main {
    public static void main(String[]args){
        Scanner myscan=new Scanner(System.in);
        System.out.println("First number");
        float a=myscan.nextFloat();
        System.out.println("Second number");
        float b=myscan.nextFloat();
        System.out.println("Enter in your operator:\n1.Add\n2.Minus\n3.Divide\n4.Product");
        int operator=myscan.nextInt();
        if (operator==1) {
            Add addObj=new Add(a, b);
            addObj.findSum();
            System.out.println("The First number used is: "+addObj.getNum1());
            System.out.println("The Second number used is: "+addObj.getNum2());     
        }else if (operator==2) {
            Minus minusObj=new Minus(a, b);
            minusObj.findDiff();
            System.out.println("The First number used is: "+minusObj.getNum1());
            System.out.println("The Second number used is: "+minusObj.getNum2());
        }else if(operator==3){
            Divide dividObj=new Divide(a, b);
            dividObj.findDivide();
            System.out.println("The First number used is: "+dividObj.getNum1());
            System.out.println("The Second number used is: "+dividObj.getNum2());

        }else if (operator==4) {
            Product productObj=new Product(a, b);
            productObj.findProduct();
            System.out.println("The First number used is: "+productObj.getNum1());
            System.out.println("The Second number used is: "+productObj.getNum2());
        }else{
            System.out.println("Enter in operator among that 4");
        }
        
    }
        
}
