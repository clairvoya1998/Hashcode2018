import java.util.ArrayList;

public class Vehicle {
    Intersection currentPosition;

<<<<<<< HEAD
    ArrayList<Ride> rides;
    Intersection location;
    int currentStep;

=======
    Vehicle() {
        this.currentPosition = new Intersection(0, 0);
    }

    public void setPosition(int x, int y) {
        this.currentPosition.setX(x);
        this.currentPosition.setY(y);
    }
>>>>>>> b619bd1c49ccd4da2da570df2a4c0acc757419c1
}
