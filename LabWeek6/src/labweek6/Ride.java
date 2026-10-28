package labweek6;

public class Ride {
    
    private String passengerName;
    private String pickup;
    private String destination;
    private double distanceKm;
    private int durationMin;
    private double pricePerKm;

    public Ride(String passengerName, String pickup, String destination, double distanceKm, int durationMin, double pricePerKm) {
        this.passengerName = passengerName;
        this.pickup = pickup;
        this.destination = destination;
         if (distanceKm <= 0 || durationMin <= 0 || pricePerKm <= 0) {
            System.out.println("Warning: Values must be positive!");
            this.distanceKm = 1;
            this.durationMin = 1;
            this.pricePerKm = 1;
        } else {
            this.distanceKm = distanceKm;
            this.durationMin = durationMin;
            this.pricePerKm = pricePerKm;
        }
    }
    
    public double calculateFare() {
        return distanceKm * pricePerKm;
    }

    @Override
    public String toString() {
        return "Passenger Name: " + passengerName + ", Pickup: " + pickup + ", Destination: " + destination + 
               ", Distance Km: " + distanceKm + ", Duration Min: " + durationMin + ", Price Per Km: " + pricePerKm;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public String getPickup() {
        return pickup;
    }

    public String getDestination() {
        return destination;
    }

    public double getDistanceKm() {
        return distanceKm;
    }

    public int getDurationMin() {
        return durationMin;
    }

    public double getPricePerKm() {
        return pricePerKm;
    }
    
    
}
