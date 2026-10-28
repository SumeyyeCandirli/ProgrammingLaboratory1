package labweek6;

import java.util.ArrayList;

public class LabWeek6 {

    public static void main(String[] args) {
        
        ArrayList<Ride> list = new ArrayList<>();

        Ride baseRide = new Ride("Ali", "Kizilay", "Ulus", 10, 12, 15);
        EconomyRide obj1 = new EconomyRide(5, "Ahmet", "Kizilay", "Esenyurt", 25, 15, 8);
        PremiumRide obj2 = new PremiumRide(10, 2, "Ayse", "Kizilay", "Esenyurt", 25, 15, 8);
        SharedRide obj3 = new SharedRide(3, "Mehmet", "Kizilay", "Esenyurt", 25, 15, 9);

        list.add(baseRide);
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);

        for (Ride r : list) {
            System.out.println(r);
            System.out.println("Fare: " + r.calculateFare() + " TL");
            System.out.println("---------------------------------------------");
        }

        System.out.println("Total Rides Count: " + list.size());
    }
    
}
