import java.util.Scanner;
public class Functions {
    public static float add(float num1,float num2){
        float add=num1+num2;
        return add;
    }
    public static float minus(float num1,float num2){
        float minus=num1-num2;
        return minus;
    }
    public static float divide(float num1,float num2){
        float deff=num1/num2;
        return deff;
    }
    public static float product(float num1,float num2){
        float product=num1*num2;
        return product;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while (true) {
            System.out.println("Enter in the first number");
        int fnumber=scan.nextInt();
        System.out.println("Enter in the second number");
        int snumber=scan.nextInt();
        System.out.println("Pick operation:\n1.Addition\n2.Substraction\n3.Multiply\n4.Division");
        int operation=scan.nextInt();
        if (operation==1) {
            System.out.println("Sum is: "+add(fnumber, snumber));
        }else if (operation==2) {
            System.out.println("Defference is: "+minus(fnumber, snumber));
        }else if (operation==3) {
            System.out.println("Product is: "+product(fnumber, snumber));
        }else if (operation==4) {
            System.out.println("Division: "+divide(fnumber, snumber));
        }else{
            System.out.println("Operation we do are only that.");
        }
        break;
        }
        System.out.println("correct");
        
    }
}
