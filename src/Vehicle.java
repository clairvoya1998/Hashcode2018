public class Vehicle {
    Intersection currentPosition;

    Vehicle() {
        this.currentPosition = new Intersection(0, 0);
    }

    public void setPosition(int x, int y) {
        this.currentPosition.setX(x);
        this.currentPosition.setY(y);
    }
}
