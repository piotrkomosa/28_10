package excer1;

public class Car extends Vehicle {

    boolean enableAC;
    public Car(String name, int fuelTank, int avgCons, boolean enableAC) {
        super(name, fuelTank, avgCons);
        this.enableAC = enableAC;
    }
    public boolean isEnableAC() {
        return enableAC;
    }
    public void setEnableAC(boolean enableAC) {
        this.enableAC = enableAC;
    }
    @Override
    String getinfo() {
        return super.getinfo();
    }
    double range() {
        if (enableAC) {
            return (getFuelTank() / (0.8 + getavgCons()))*100;
        } else {
            return super.range();
        }
    }
}
