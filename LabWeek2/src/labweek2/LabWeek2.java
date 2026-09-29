package labweek2;

import java.util.Scanner;

public class LabWeek2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of stops on the route: ");
        int numStops = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the bus's seating capacity: ");
        int capacity = scanner.nextInt();
        scanner.nextLine();

        String[] stopNames = new String[numStops];
        int[] boarding = new int[numStops];
        int[] alighting = new int[numStops];
        int[] occupancy = new int[numStops];

        for (int i = 0; i < numStops; i++) {
            System.out.println();
            System.out.println("Stop " + (i + 1) + ":");
            System.out.print("Stop name: ");
            stopNames[i] = scanner.nextLine();

            System.out.print("Passengers boarding: ");
            boarding[i] = scanner.nextInt();

            System.out.print("Passengers alighting: ");
            alighting[i] = scanner.nextInt();
            scanner.nextLine();
        }

        int currentPassengers = 0;
        int overCapacityCount = 0;

        System.out.println();
        System.out.println("--- Route Details ---");
        for (int i = 0; i < numStops; i++) {
            if (alighting[i] > currentPassengers + boarding[i]) {
                System.out.println("Data error at [" + stopNames[i] + "]: cannot have more passengers alighting than are currently on the bus. Occupancy set to 0.");
                currentPassengers = 0;
            } else {
                currentPassengers = currentPassengers + boarding[i] - alighting[i];
            }
            
            occupancy[i] = currentPassengers;
            System.out.println("Passengers on the bus after [" + stopNames[i] + "]: " + currentPassengers);

            if (currentPassengers > capacity) {
                System.out.println("Warning: Bus is over capacity at [" + stopNames[i] + "]!");
                overCapacityCount++;
            }
        }

        System.out.println();
        System.out.println("--- All Stops ---");
        for (int i = 0; i < numStops; i++) {
            System.out.println("Stop: " + stopNames[i] + " | Boarding: " + boarding[i] + " | Alighting: " + alighting[i] + " | Current: " + occupancy[i]);
        }

        int maxBoarding = -1;
        String busiestStop = "";
        double totalOccupancy = 0;

        for (int i = 0; i < numStops; i++) {
            if (boarding[i] > maxBoarding) {
                maxBoarding = boarding[i];
                busiestStop = stopNames[i];
            }
            totalOccupancy = totalOccupancy + occupancy[i];
        }

        double avgOccupancy = totalOccupancy / numStops;

        System.out.println();
        System.out.println("--- Statistics ---");
        System.out.println("Busiest stop: " + busiestStop);
        System.out.println("Average occupancy: " + avgOccupancy);
        System.out.println("Number of stops exceeding capacity: " + overCapacityCount);

        int finalOccupancy = occupancy[numStops - 1];
        if (finalOccupancy != 0) {
            System.out.println("Warning: " + finalOccupancy + " passengers still on the bus after the final stop — please check your data.");
        }

        scanner.close();

    }
    
}
