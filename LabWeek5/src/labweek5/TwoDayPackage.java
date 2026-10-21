package labweek5;

public class TwoDayPackage extends Package {
    
    protected double flatFee;

    public TwoDayPackage(double flatFee, String senderName, String senderAddress, String senderCity, String senderState, String senderZipCode, String recipientName, String recipientAddress, String recipientCity, String recipientState, String recipientZipCode, double weight, double costPerOunce) {
        super(senderName, senderAddress, senderCity, senderState, senderZipCode, recipientName, recipientAddress, recipientCity, recipientState, recipientZipCode, weight, costPerOunce);
        this.flatFee = flatFee;
    }

    @Override
    public double calculateCost() {
        double totalCost = super.calculateCost() + flatFee;
        return totalCost;
    }
    
    
    
}
