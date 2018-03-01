public class Ride implements Comparable<Ride> {

    private Intersection start, finish;
    private Integer earliest, latest;
    private static int numberOfRides = 0;
    private int id;

    Ride(Intersection start, Intersection finish, int earliest, int latest) {
        this.id = numberOfRides++;
        this.start = start;
        this.finish = finish;
        this.earliest = earliest;
        this.latest = latest;
    }

    public int getId() {
        return this.id;
    }

    public int getEarliest() {
        return this.earliest;
    }

    public int getLatest() {
        return this.latest;
    }

    public Intersection getStart() {
        return this.start;
    }

    public Intersection getFinish() {
        return this.finish;
    }

    public static void reset() {
        numberOfRides = 0;
    }

    @Override
    public int compareTo(Ride ride) {
        return this.latest.compareTo(ride.latest);
    }
}
