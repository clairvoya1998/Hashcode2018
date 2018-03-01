import java.util.*;

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
        // sorted rides
        Collections.sort(this.rides);
        while (!rides.isEmpty()) {
            Ride ride = rides.get(0);

            //Sort vehicles based on position
            Arrays.sort(vehicles, new Comparator<Vehicle>() {
                @Override
                public int compare(Vehicle o1, Vehicle o2) {
                    if (o1.getCurrentPosition().distanceTo(ride.getStart()) <
                            o2.getCurrentPosition().distanceTo(ride.getStart())) {
                        return  -1;
                    }
                    if (o1.getCurrentPosition().distanceTo(ride.getStart()) >
                            o2.getCurrentPosition().distanceTo(ride.getStart())) {
                        return 1;
                    }
                    return 0;
                }
            });

            boolean needsCar = true;
            int i = 0;
            while (needsCar) {
                Vehicle vehicle = vehicles[i];
                if ((vehicle.currentStep + vehicle.getCurrentPosition().distanceTo(ride.getStart()) +
                        ride.getStart().distanceTo(ride.getFinish())) < ride.getLatest()) {
                    //vehicle will be on time
                    vehicle.setPosition(ride.getFinish().getX(), ride.getFinish().getY());
                    if ((vehicle.currentStep + vehicle.getCurrentPosition().distanceTo(ride.getStart()))
                            < ride.getEarliest()) {
                        //Vehicle will be early
                        vehicle.currentStep = ride.getEarliest() + ride.getStart().distanceTo(ride.getFinish());
                    }
                    else
                        vehicle.currentStep += vehicle.getCurrentPosition().distanceTo(ride.getStart()) +
                                ride.getStart().distanceTo(ride.getFinish());
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
