package labweek6;

public class PremiumRide extends Ride {
    
    protected double comfortFee;
    protected double surgeMultiplier;

    public PremiumRide(double comfortFee, double surgeMultiplier, String passengerName, String pickup, String destination, double distanceKm, int durationMin, double pricePerKm) {
        super(passengerName, pickup, destination, distanceKm, durationMin, pricePerKm);
        this.comfortFee = comfortFee;
        if (surgeMultiplier < 1.0 || surgeMultiplier > 3.0) {
            System.out.println("Warning: surgeMultiplier must be between 1.0 and 3.0!");
            this.surgeMultiplier = 1.0;
        } else {
            this.surgeMultiplier = surgeMultiplier;
        }
    }
    
    @Override
    public double calculateFare() {
        return (super.calculateFare() + comfortFee) * surgeMultiplier;
    }

    @Override
    public String toString() {
        return super.toString() + ", Comfort Fee: " + comfortFee + ", Surge Multiplier: " + surgeMultiplier;
    }
    
    
}
