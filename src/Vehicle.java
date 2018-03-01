import java.util.ArrayList;

public class Vehicle {
    private Intersection currentPosition;
<<<<<<< HEAD
    ArrayList<Ride> rides;
=======
    ArrayList<Ride> rides = new ArrayList<>();
    ArrayList<Integer> ids = new ArrayList<>();
    Intersection location;
>>>>>>> 387a73d612a7cd284945ecc382b5fc19ef406767
    int currentStep;

    Vehicle() {
        this.currentPosition = new Intersection(0, 0);
    }

    public void setPosition(int x, int y) {
        this.currentPosition.setX(x);
        this.currentPosition.setY(y);
    }

    public Intersection getCurrentPosition() {
        return this.currentPosition;
    }
}
