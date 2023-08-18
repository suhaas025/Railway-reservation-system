package try2;
import java.util.ArrayList;
class Booking {
    private ArrayList<Ticket> tickets = new ArrayList<Ticket>();
    
    public void showTrains() {
        System.out.println("List of available trains:");
        System.out.println("ID\t\tName\t\tSource\t\tDestination\t\tDate\t\tfare");
        
        Train t1 = new Train(1, "Rajdhani", "Chennai", "Coimbatore", "06-Jan-2022", 800.0);
        Train t2 = new Train(2, "Shatabdi", "Delhi", "Chandigarh", "06-Jan-2022", 1100.0);
        Train t3 = new Train(3, "vandhe bharat","Madurai", "Kanyakumari", "06-Jan-2022", 550.0);
        Train t4 = new Train(4, "Thejas", "        Coimbatore","Trichy", "06-Jan-2022", 1900.0);
        
        Train[] trains = {t1, t2, t3, t4};
        

for (Train t : trains) {
    System.out.println(t.gettrainid() + "\t\t" + t.gettrainname() + "\t" + t.getSource() + "\t\t" + t.getDestination() + "\t\t" + t.getDate() + "\t" + t.getfare());
}
    }
    

public void bookTicket(int trainid, String passengerName) {
    
    Train selectedTrain = null;
    Train t1 = new Train(1, "Rajdhani", "Chennai", "Coimbatore", "06-Jan-2022", 800.0);
    Train t2 = new Train(2, "Shatabdi", "Delhi", "Chandigarh", "06-Jan-2022", 1100.0);
    Train t3 = new Train(3, "vandhe bharat", "Madurai", "Kanyakumari", "06-Jan-2022", 550.0);
    Train t4 = new Train(4, "Thejas", "Coimbatore", "Trichy", "06-Jan-2022", 1900.0);
    Train[] trains = {t1, t2, t3, t4};
    for (Train t : trains) {
        if (t.gettrainid() == trainid) {
            selectedTrain = t;
            break;
        }
    }
    
    if (selectedTrain == null) {
        System.out.println("Invalid Train ID.");
        return;
    }
    
    int ticketId = tickets.size() + 1;
    
    Ticket ticket = new Ticket(selectedTrain.gettrainid(), selectedTrain.gettrainname(), selectedTrain.getSource(), selectedTrain.getDestination(), selectedTrain.getDate(), selectedTrain.getfare(), ticketId, passengerName);
    
    tickets.add(ticket);
    
    System.out.println("Ticket booked successfully.");
    System.out.println("Ticket ID: " + ticketId);
    System.out.println("Passenger Name: " + passengerName);
    System.out.println("Train Name: " + selectedTrain.gettrainname());
    System.out.println("Source: " + selectedTrain.getSource());
    System.out.println("Destination: " + selectedTrain.getDestination());
    System.out.println("Date: " + selectedTrain.getDate());
    System.out.println("fare: " + selectedTrain.getfare());
}

    
    public void cancelTicket(int ticketId) {
        for (int i = 0; i < tickets.size(); i++) {
            Ticket ticket = tickets.get(i);
            if (ticket.getTicketId() == ticketId) {
                tickets.remove(i);
                System.out.println("Ticket cancelled successfully. Ticket ID: " + ticketId);
                return;
            }
        }
        System.out.println("Invalid ticket ID.");
    }
    
    public void showTicket(int ticketId) {
        for (int i = 0; i < tickets.size(); i++) {
            Ticket ticket = tickets.get(i);
            if (ticket.getTicketId() == ticketId) {
                System.out.println("Ticket ID: " + ticket.getTicketId());
                System.out.println("Train Name: " + ticket.gettrainname());
                System.out.println("Source: " + ticket.getSource());
                System.out.println("Destination: " + ticket.getDestination());
                System.out.println("Date: " + ticket.getDate());
                System.out.println("Balance to be paid " + ticket.getfare());
                System.out.println("Passenger Name: " + ticket.getPassengerName());
                if (ticket.getfare() == 0) {
                    System.out.println("Payment: Complete");
                } else {
                    System.out.println("Payment: Incomplete");
                }
                return;
            }
        }
        System.out.println("Invalid ticket ID.");
    }
    
    public void payment(int ticketId, double amount) {
        for (int i = 0; i < tickets.size(); i++) {
            Ticket ticket = tickets.get(i);
            if (ticket.getTicketId() == ticketId) {
                double balance = ticket.getfare() - amount;
                if (balance > 0) {
                    System.out.println("Payment successful. Remaining balance: " + balance);
                } else {
                    System.out.println("Payment successful. Thank you for booking with us.");
                }   
                ticket = new Ticket(ticket.gettrainid(), ticket.gettrainname(), ticket.getSource(), ticket.getDestination(), ticket.getDate(), balance, ticket.getTicketId(), ticket.getPassengerName());
                tickets.set(i, ticket);
                return;
            }
        }
        System.out.println("Invalid ticket ID.");
    }
}

