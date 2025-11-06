import java.util.Scanner;
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
        }else if (operator==2) {
            Minus minusObj=new Minus(a, b);
            minusObj.findDiff();
        }else if(operator==3){
            Divide dividObj=new Divide(a, b);
            dividObj.findDivide();
        }else if (operator==4) {
            Product productObj=new Product(a, b);
            productObj.findProduct();
        }else{
            System.out.println("Enter in operator among that 4");
        }
    }
        
}
