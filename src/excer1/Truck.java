package excer1;

public class Truck  extends Car{

    private int cargo;

    public Truck(String name, int fuelTank, int avgFuelConsu, boolean enableAC, int cargo) {
        super(name, fuelTank, avgFuelConsu, enableAC);
        this.cargo = cargo;
    }

    public int getCargo() {
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
    double fuelConsumption() {
        if(enableAC)
        {
            return super.fuelConsumption() + 1.6;
        }
        else{
            return super.fuelConsumption();
        }

    }
}
