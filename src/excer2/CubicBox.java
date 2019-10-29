package excer2;

public class CubicBox extends Boxes {

    private int sideA;
    private int sideB;

    public CubicBox(int h, int sideA, int sideB) {
        super(h);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }
}



