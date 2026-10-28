package labweek6;

public class EconomyRide extends Ride {
    
    protected double pricePerMinute;

    public EconomyRide(double pricePerMinute, String passengerName, String pickup, String destination, double distanceKm, int durationMin, double pricePerKm) {
        super(passengerName, pickup, destination, distanceKm, durationMin, pricePerKm);
        this.pricePerMinute = pricePerMinute;
    }
    
    @Override
    public double calculateFare() {
        double totalFare = super.calculateFare() + (getDurationMin() * pricePerMinute);
        if (totalFare < 50.0) {
            return 50.0;
        }
        return totalFare;
    }

    @Override
    public String toString() {
        return super.toString() + ", Price Per Minute: " + pricePerMinute;
    }
    
}
