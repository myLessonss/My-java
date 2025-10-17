//Am going to correct all questions based on if statements in this file
import java.util.Scanner;
public class Answers{
    public static void main(String [] args){
     //Checking if interger is positive or negative
        int number;
        Scanner myscanner=new Scanner(System.in);
        System.out.print("\nEnter in a number u want: ");
        number=myscanner.nextInt();
        if(number>0){
            System.out.println("The number you entered "+number+" is POSITIVE");
        }else if(number<0){
            System.out.println("The number you entered "+number+" is NEGATIVE");
        }else{
            System.out.println("The number u entered is ZERO");
        }
     //Comparing two numbers
        int comparenum1,comparenum2;
        System.out.println("\nEnter in Two numbers to compare:");
        comparenum1=myscanner.nextInt();
        comparenum2=myscanner.nextInt();
        if(comparenum1>comparenum2){
            System.out.println("The "+comparenum1+" is GREATEST NUMBER" );
        }else if(comparenum1<comparenum2){
            System.out.println("The "+comparenum2+" is GREATEST NUMBER");
        }else{
            System.out.println("ALL NUMBERS ARE EQUAL");
        }
    //checking if year is leap year
        int year;
        System.out.println("\n Enter in the year to check if it is leap year: ");
        year=myscanner.nextInt();
        if (year%4==0 || (year%400==0 && year%100==0)){
            System.out.println("LEAP YEAR");
        }else{
            System.out.println("NOT LEAP YEAR");
        }
        

          

    }
}