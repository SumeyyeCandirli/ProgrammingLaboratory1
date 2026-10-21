package labweek5;

public class OverNightPackage extends Package{
    
    protected double af;

    public OverNightPackage(double af, String senderName, String senderAddress, String senderCity, String senderState, String senderZipCode, String recipientName, String recipientAddress, String recipientCity, String recipientState, String recipientZipCode, double weight, double costPerOunce) {
        super(senderName, senderAddress, senderCity, senderState, senderZipCode, recipientName, recipientAddress, recipientCity, recipientState, recipientZipCode, weight, costPerOunce);
        this.af = af;
    }

    @Override
    public double calculateCost() {
        double totalCost = super.calculateCost() + (weight * af);
        return totalCost;
    }
    
    
    
}
