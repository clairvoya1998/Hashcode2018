import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Map {
    Vehicle[] vehicles;
    Ride[] rides;
    int bonus, steps;
    int[][] map;
    Map(int numberOfRows, int numberOfCols, int numberOfVehicles, int numberOfRides, int numberOfBonus, int numberOfSteps) {
        this.map = new int[numberOfRows][numberOfCols];
        this.bonus = numberOfBonus;
        this.vehicles = new Vehicle[numberOfVehicles];
        this.rides = new Ride[numberOfRides];
        this.steps = numberOfSteps;
    }

    Map() {
    }

    void run() {
        List<Ride> ridesList = Arrays.asList(rides);
        while (!ridesList.isEmpty()) {
            Ride ride = ridesList.get(0);
            //Sort vehicles based on position

            boolean needsCar = true;
            int i = 0;
            while (needsCar) {
                Vehicle vehicle = vehicles.get(i);

                if (canMakeTheRide) {
                    //Set new location to vehicle.
                    if (carwillbeearly) {
                        vehicle.currentStep = ride.earliest + duration;
                    }
                    else
                        vehicle.currentStep += timeToStartLocation + duration;
                    needsCar = false;
                    vehicle.rides.add(ride);
                    ridesList.remove(0);
                }
                else {
                    if (i >= ridesList.size()) {
                        //No car that can make the trip was found, break from loop and abandon ride
                        ridesList.remove(0);
                        break;
                    }
                    i++;
                }
            }

        }
    }
}
