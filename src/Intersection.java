public class Intersection {

    private int x, y;

    Intersection(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int distanceTo(Intersection intersection) {
        return Math.abs(this.x - intersection.x) + Math.abs(this.y - intersection.y);
    }
}
