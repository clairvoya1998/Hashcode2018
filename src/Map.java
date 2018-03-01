import java.util.ArrayList;

public class Map {
    Vehicle[] vehicles;
    ArrayList<Ride> rides;
    int bonus, steps, NoOfRides;
    int[][] map;
    Map(int numberOfRows, int numberOfCols, int numberOfVehicles, int numberOfRides, int numberOfBonus, int numberOfSteps) {
        this.map = new int[numberOfRows][numberOfCols];
        this.bonus = numberOfBonus;
        this.vehicles = new Vehicle[numberOfVehicles];
        this.NoOfRides = numberOfRides;
        this.steps = numberOfSteps;
    }

    public void setRides(ArrayList<Ride> rides) {
        this.rides = rides;
    }

    void run() {
        while (!rides.isEmpty()) {
            Ride ride = rides.get(0);
            //Sort vehicles based on position

            boolean needsCar = true;
            int i = 0;
            while (needsCar) {
                Vehicle vehicle = vehicles[i];

                if ((vehicle.currentStep + vehicle.currentPosition.distanceTo(ride.start) +
                        ride.start.distanceTo(ride.finish)) < ride.latest) {
                    //vehicle will be on time
                    vehicle.currentPosition = ride.finish;
                    if ((vehicle.currentStep + vehicle.currentPosition.distanceTo(ride.start))
                            < ride.earliest) {
                        //Vehicle will be early
                        vehicle.currentStep = ride.earliest + ride.start.distanceTo(ride.finish);
                    }
                    else
                        vehicle.currentStep += vehicle.currentPosition.distanceTo(ride.start) +
                                ride.start.distanceTo(ride.finish);
                    needsCar = false;
                    vehicle.rides.add(ride);
                    rides.remove(0);
                }
                else {
                    if (i >= rides.size()) {
                        //No car that can make the trip was found, break from loop and abandon ride
                        rides.remove(0);
                        break;
                    }
                    i++;
                }
            }

        }
    }
}
