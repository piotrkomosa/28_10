package excer2;

public class CylinderBox extends Boxes {

    private int radius;
    public CylinderBox(int h, int radius) {
        super(h);
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
}
