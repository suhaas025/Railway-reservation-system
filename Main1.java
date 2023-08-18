package try2;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Booking booking = new Booking();
        boolean flag=login();
        
        
       
        while (flag) {
            System.out.println("\nWelcome To Railway Reservation System\n");
            System.out.println("1. Show available Trains");
            System.out.println("2. Book a ticket");
            System.out.println("3. Cancel a ticket");
            System.out.println("4. Show ticket details");
            System.out.println("5. Make payment");
            System.out.println("6. Exit");
            System.out.print("\nEnter your choice: ");
            
            
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    
                    booking.showTrains();
                    break;
                case 2:
                    System.out.print("Enter the Train ID: ");
                    int trainid = scan.nextInt();
                    scan.nextLine(); 
                    System.out.print("Enter the passenger name: ");
                    String passengerName = scan.nextLine();
                    booking.bookTicket(trainid, passengerName);
                    break;
                case 3:
                    System.out.print("Enter the ticket ID: ");
                    int ticketId = scan.nextInt();
                    booking.cancelTicket(ticketId);
                    break;
                case 4:
                    System.out.print("Enter the ticket ID: ");
                    ticketId = scan.nextInt();
                    booking.showTicket(ticketId);
                    break;
                case 5:
                    System.out.print("Enter the ticket ID: ");
                    ticketId = scan.nextInt();
                    System.out.print("Enter the payment amount: ");
                    double amount = scan.nextDouble();
                    booking.payment(ticketId, amount);
                    break;
               
                    case 6:
                    scan.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        
        	
        }
    

	public static boolean login() {
		
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter username: ");
	        String username = sc.nextLine();
	        System.out.print("Enter password: ");
	        String password = sc.nextLine();
	        if (username.equals("user") && password.equals("user")) {
	            System.out.println("Welcome, user!");
	           
	            return true;
	            
	            
	        } else {
	            System.out.println("Invalid login! Please try again.");
	            return false;
	            
	            
	        }
	    
		
	}


	
}
