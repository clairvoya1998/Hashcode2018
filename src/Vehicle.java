import java.util.ArrayList;

public class Vehicle {
    private Intersection currentPosition;
    ArrayList<Ride> rides;
    Intersection location;
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
