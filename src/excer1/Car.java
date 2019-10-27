package excer1;

public class Car extends Vehicle {

    boolean enableAC;

    public Car(String name, int fuelTank, int avgFuelCons, boolean enableAC) {
        super(name, fuelTank, avgFuelCons);
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

    double fuelConsumption() {
        if(enableAC)
        {
            return super.range() + 0.8;
        }
        else{
            return super.range();
        }

    }
}
