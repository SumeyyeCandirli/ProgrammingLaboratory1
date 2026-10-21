package labweek5;

public class Package {
    
    protected String senderName;
    protected String senderAddress;
    protected String senderCity;
    protected String senderState;
    protected String senderZipCode;

    protected String recipientName;
    protected String recipientAddress;
    protected String recipientCity;
    protected String recipientState;
    protected String recipientZipCode;

    protected double weight;
    protected double costPerOunce;

    public Package(String senderName, String senderAddress, String senderCity, String senderState, String senderZipCode, String recipientName, String recipientAddress, String recipientCity, String recipientState, String recipientZipCode, double weight, double costPerOunce) {
        this.senderName = senderName;
        this.senderAddress = senderAddress;
        this.senderCity = senderCity;
        this.senderState = senderState;
        this.senderZipCode = senderZipCode;
        this.recipientName = recipientName;
        this.recipientAddress = recipientAddress;
        this.recipientCity = recipientCity;
        this.recipientState = recipientState;
        this.recipientZipCode = recipientZipCode;
        this.weight = weight;
        this.costPerOunce = costPerOunce;
        
        if (weight <= 0 || costPerOunce <= 0) {
            System.out.println("Weight and cost per ounce must be positive!");
        }
    }
    
    public double calculateCost() {
        double totalCost = weight * costPerOunce;
        return totalCost;
    }
    
    
    
}
