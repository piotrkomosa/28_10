package excer1;

public class Vehicle {
    public static int FUEL_INDEX=100;

    private String name;
    private double fuelTank;
    private double avgCons;

    public Vehicle(String name, int fuelTank, int avgFuelCons) {
        this.name = name;
        this.fuelTank = fuelTank;
        this.avgCons = avgFuelCons;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(double fuelTank) {
        this.fuelTank = fuelTank;
    }

    public double getavgCons() {
        return avgCons;
    }

    public void setavgCons(double avgCons) {
        this.avgCons = avgCons;
    }

    String getinfo() {
        return name + "," + " pojemnosc zbiornika paliwa: " + fuelTank + " litórw" + " oraz średnie spalanie " + avgCons + " litrów/100km.";
    }
    double range() {
        double range;
        return range = fuelTank / avgCons*100;
    }
}
