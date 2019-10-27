package excer1;

public class Truck extends Car {

    private double cargo;
    public Truck(String name, int fuelTank, int avgFuelConsu, boolean enableAC, int cargo) {
        super(name, fuelTank, avgFuelConsu, enableAC);
        this.cargo = cargo;
    }
    public double getCargo() {
        return cargo;
    }
    public void setCargo(int cargo) {
        this.cargo = cargo;
    }
    @Override
    String getinfo() {
        return super.getinfo();
    }
    double range() {
        if (enableAC) {
            return super.range() - getFuelTank() / 1.6 + getavgCons() + (getFuelTank() / ((cargo / 100) * 0.5 + getavgCons()))*100;
        } else {
            return super.range() + (getFuelTank() / ((cargo / 100 )* 0.5 + getavgCons()))*100;
        }
    }
}
