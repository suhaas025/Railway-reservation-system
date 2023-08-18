package try2;


class Train {
    private int trainid;
    private String trainname;
    private String source;
    private String destination;
    private String date;
    private double fare;
    
    public Train(int trainid, String trainname, String source, String destination, String date, double fare) {
        this.trainid = trainid;
        this.trainname = trainname;
        this.source = source;
        this.destination = destination;
        this.date = date;
        this.fare = fare;
    }
    
    public int gettrainid() {
        return trainid;
    }
    
    public String gettrainname() {
        return trainname;
    }
    
    public String getSource() {
        return source;
    }
    
    public String getDestination() {
        return destination;
    }
    
    public String getDate() {
        return date;
    }
    
    public double getfare() {
        return fare;
    }
}
