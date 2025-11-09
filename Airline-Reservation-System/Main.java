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
        //adding flight
        System.out.println("Add flight");
        System.out.print("Flight number: ");
        int flightNumber=myscan.nextInt();
        myscan.nextLine();
        System.out.print("Flight destination:");
        String flightDestination=myscan.nextLine();

        System.out.print("Flight fare:");
        String flightFare=myscan.nextLine();
        System.out.print("Available seats:");
        int availableSeats=myscan.nextInt();
        Flight flightObj=new Flight(flightNumber, flightDestination, flightFare, availableSeats);
        flightObj.addFlight();
        //Booking Flight
        System.out.println("Booking Flight");
        System.out.print(" Booking Id:");
        int bookFlight=myscan.nextInt();
        String passenger=userName;
        String flight=flightDestination;
        Booking bookingObj=new Booking(bookFlight, passenger, flight);
        bookingObj.bookFlight();
        
    }
}