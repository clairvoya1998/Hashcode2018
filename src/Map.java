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
}
