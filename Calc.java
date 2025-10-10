import java.util.Scanner;
public class Calc{
    public void add(int x,int y){
        int sum=x+y;
        System.out.println(x+"+"+y+"="+sum);
    }
    public void minus(int x,int y){
        int diff=x-y;
        System.out.println(x+"-"+y+"="+diff);
    }
    public void product(int x,int y){
        int prod=x*y;
        System.out.println(x+"x"+y+"="+prod);
    }
    public void division(int x,int y){
        if(y!=0){
            double div=(double)x/y;
            System.out.println(x+"/"+y+"="+div);
        }else{
            System.out.println("Error: The base must not equal to 0");
        }
        
    }

public static void main(String [] args){
    int a,b,c;
    Scanner myscanner=new Scanner(System.in);
    System.out.println("Enter in first number: ");
    a=myscanner.nextInt();
    System.out.println("Enter in second number: ");
    b=myscanner.nextInt();
    System.out.println("Enter in the number of operation:\n 1.ADD\n 2.SUBSTRACT\n 3.MULTIPLY\n 4.DIVISION");
    c=myscanner.nextInt();
    Calc mymethod=new Calc();
    switch(c){
        case 1:mymethod.add(a,b);
        break;
        case 2:mymethod.minus(a, b);
        break;
        case 3:mymethod.product(a,b);
        break;
        case 4:mymethod.division(a,b);
        break;
        default:System.out.println("Enter in the correct number for product2");
    }
}
}
