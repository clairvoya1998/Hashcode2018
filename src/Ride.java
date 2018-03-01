public class Ride {

    Intersection start, finish;
    int earliest, latest;
    private static int numberOfRides = 0;
    int id;

    Ride(Intersection start, Intersection finish, int earliest, int latest) {
        this.id = numberOfRides++;
        this.start = start;
        this.finish = finish;
        this.earliest = earliest;
        this.latest = latest;
    }
}
