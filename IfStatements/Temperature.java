//Ask for temperature; print “Cold” if below 10, “Warm” if 10–25, else “Hot”.
import java.util.Scanner;
public class Temperature{
    public static void main(String[]args){
        double temp;
        Scanner tempscanner=new Scanner(System.in);
        System.out.println("\nEnter in temperature: ");
        temp=tempscanner.nextDouble();
        if (temp<10){
            System.out.println("COLD");
        }else if(temp>10 &&temp<25){
            System.out.println("WARM");
        }else{
            System.out.println("HOT");
        }
    }
}