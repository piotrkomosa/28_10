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
    @Override
    double range() {
        double acIndex1=0.8;
        if (enableAC) {
            return (getFuelTank() / (acIndex1 + getavgCons()))*FUEL_INDEX;
        } else {
            return super.range();
        }
    }
}
