package excer1;

public class Truck extends Car {

    private double cargo;
    public Truck(String name, int fuelTank, int avgCons, boolean enableAC, int cargo) {
        super(name, fuelTank, avgCons, enableAC);
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
            return  getFuelTank() / ((cargo / 100) * 0.5 + getavgCons())*100;
        } else {
            return  getFuelTank() / ((cargo / 100 ) * 0.5 + getavgCons())*100;
        }
    }
}
