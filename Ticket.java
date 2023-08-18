package try2;


class Ticket extends Train {
 private int ticketId;
 private String passengerName;
 
 public Ticket(int trainid, String trainname, String source, String destination, String date, double fare, int ticketId, String passengerName) {
     super(trainid, trainname, source, destination, date, fare);
     this.ticketId = ticketId;
     this.passengerName = passengerName;
 }
 
 public int getTicketId() {
     return ticketId;
 }
 
 public String getPassengerName() {
     return passengerName;
 }
}