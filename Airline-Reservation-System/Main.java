import Operation.User;
import Operation.Passenger;
import Operation.Flight;
import Operation.Booking;
import java.util.Scanner;
public class Main{

    public static void main(String[]args){
        Scanner myscan=new Scanner(System.in);
        //Entering staff and user detail
        System.out.println("Entering user details: ");
        System.out.print("Name: ");
        String userName=myscan.nextLine();
        System.out.print("Id: ");
        int userId=myscan.nextInt();
        myscan.nextLine();
        System.out.print("Postion: ");
        String staffPostion=myscan.nextLine();
        User userObj=new User(userName,userId,staffPostion);
        System.out.println("Are you a staff or passenger");
        String type=myscan.nextLine();
        if(type.equalsIgnoreCase("staff")){
            userObj.registerStaff();
        }else{
            userObj.registerPassenger();
        }
        
    }
}