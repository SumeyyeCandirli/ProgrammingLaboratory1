package labweek6;

public class SharedRide extends Ride {
    
    protected int passengerCount;

    public SharedRide(int passengerCount, String passengerName, String pickup, String destination, double distanceKm, int durationMin, double pricePerKm) {
        super(passengerName, pickup, destination, distanceKm, durationMin, pricePerKm);
          if (passengerCount < 1 || passengerCount > 4) {
            System.out.println("Warning: passengerCount must be between 1 and 4!");
            this.passengerCount = 1;
        } else {
            this.passengerCount = passengerCount;
        }
    }
    
    @Override
    public double calculateFare() {
        double economyFare = super.calculateFare();
        double farePerPerson = economyFare / passengerCount;
        return farePerPerson + (farePerPerson * 0.10);
    }

    @Override
    public String toString() {
        return super.toString() + ", Passenger Count: " + passengerCount;
    }
     
     
    
}
