package TaxCalculator;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        double turnover;
        //Entering the turnover Amount
        Scanner myscanner=new Scanner(System.in);
        System.out.println("\nEnter in the Turnover Amount:");
        turnover=myscanner.nextDouble();
        //making constructor for the outside class
        Vat myVat= new Vat();
        IncomeTax myIncomeTax= new IncomeTax();
        ExerciseDuty myExerciseDuty=new ExerciseDuty();
        //Showing the tax calculated
        double x=myVat.VatMethod(turnover);
        double y=myIncomeTax.IncomeTaxMethod(turnover);
        double z=myExerciseDuty.exerciseDutyMethod(turnover);
        System.out.println("VAT= "+x);
        System.out.println("INCOME TAX= "+y);
        System.out.println("EXERCISES DUTY= "+z);
        //Calculating balance and showing it 
        double balance=turnover-(x+y+z);
        System.out.println("BALANCE= "+balance);
        
    }
}
