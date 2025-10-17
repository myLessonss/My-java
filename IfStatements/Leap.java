import java.util.Scanner;
public class Leap {
    public static void main(String [] args){
         //checking if year is leap year
        int year;
        Scanner myscanner=new Scanner(System.in);
        System.out.println("\n Enter in the year to check if it is leap year: ");
        year=myscanner.nextInt();
        if (year%4==0){
            if (year%100==0){
                if (year%400==0){
                    System.out.println("LEAP YEAR");
                }else{
                    System.out.println("NOT LEAP YEAR");
                }
            }else{
                System.out.println("LEAP YEAR");
            }
        }else{
            System.out.println("NOT LEAP YEAR");
        } 
    myscanner.close();       
    }
}

