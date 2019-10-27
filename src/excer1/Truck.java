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
    double range() {
        if(enableAC)
        {
            return super.range()- getFuelTank()/0.8*getavgCons() - getFuelTank()/(cargo/100*0.5*getavgCons());
        }
        else{
            return super.range() - getFuelTank()/(cargo/100*0.5*getavgCons());
        }
    }
}
