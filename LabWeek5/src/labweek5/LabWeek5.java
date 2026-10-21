package labweek5;

public class LabWeek5 {

    public static void main(String[] args) {
       
        TwoDayPackage package1 = new TwoDayPackage(12.5, "Emma Watson", "742 Evergreen Terrace", "Springfield", "OR", "97477", "John Miller", "221B Baker Street", "New York", "NY", "10001", 16.0, 3.5);
        OverNightPackage package2 = new OverNightPackage(2.5, "Lucas Graham", "405 Lexington Avenue", "New York", "NY", "10174", "Sophia Davis", "1600 Pennsylvania Avenue", "Washington", "DC", "20500", 10.0, 4.0);
        
        System.out.println("=================================================");
        System.out.println("             PACKAGE SHIPPING CARD 1             ");
        System.out.println("             [ Two-Day Delivery ]                ");
        System.out.println("=================================================");
        System.out.println("FROM (SENDER):");
        System.out.println("  " + package1.senderName);
        System.out.println("  " + package1.senderAddress);
        System.out.println("  " + package1.senderCity + ", " + package1.senderState + " " + package1.senderZipCode);
        System.out.println("-------------------------------------------------");
        System.out.println("TO (RECIPIENT):");
        System.out.println("  " + package1.recipientName);
        System.out.println("  " + package1.recipientAddress);
        System.out.println("  " + package1.recipientCity + ", " + package1.recipientState + " " + package1.recipientZipCode);
        System.out.println("-------------------------------------------------");
        System.out.println("PACKAGE DETAILS:");
        System.out.println("  Weight         : " + package1.weight + " oz");
        System.out.println("  Cost Per Ounce : $" + package1.costPerOunce);
        System.out.println("  Flat Fee       : $" + package1.flatFee);
        System.out.println("  TOTAL COST     : $" + package1.calculateCost());
        System.out.println("=================================================\n");

        System.out.println("=================================================");
        System.out.println("             PACKAGE SHIPPING CARD 2             ");
        System.out.println("             [ Overnight Express ]               ");
        System.out.println("=================================================");
        System.out.println("FROM (SENDER):");
        System.out.println("  " + package2.senderName);
        System.out.println("  " + package2.senderAddress);
        System.out.println("  " + package2.senderCity + ", " + package2.senderState + " " + package2.senderZipCode);
        System.out.println("-------------------------------------------------");
        System.out.println("TO (RECIPIENT):");
        System.out.println("  " + package2.recipientName);
        System.out.println("  " + package2.recipientAddress);
        System.out.println("  " + package2.recipientCity + ", " + package2.recipientState + " " + package2.recipientZipCode);
        System.out.println("-------------------------------------------------");
        System.out.println("PACKAGE DETAILS:");
        System.out.println("  Weight         : " + package2.weight + " oz");
        System.out.println("  Cost Per Ounce : $" + package2.costPerOunce);
        System.out.println("  Add. Fee / oz  : $" + package2.af);
        System.out.println("  TOTAL COST     : $" + package2.calculateCost());
        System.out.println("=================================================");
    
    }
    
}
