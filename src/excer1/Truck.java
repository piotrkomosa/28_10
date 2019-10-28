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
    @Override
    double range() {
        double acIndex2=1.6;
        double cargoIndex=0.5;
        if (enableAC) {
            return  (FUEL_INDEX* getFuelTank()) /( acIndex2 + ((cargo / 100) * cargoIndex )+getavgCons());
        } else {
            return (FUEL_INDEX* getFuelTank()) /(((cargo / 100) * cargoIndex )+getavgCons());
        }
    }
}
