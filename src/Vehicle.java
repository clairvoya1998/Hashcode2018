import java.util.ArrayList;

public class Vehicle {
    private Intersection currentPosition;
    ArrayList<Ride> rides;
<<<<<<< HEAD
=======
    Intersection location;
>>>>>>> 2012b81e6fd2ec8b2a0328f0ff52d005bcadb976
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
