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
}
