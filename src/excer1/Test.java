package excer1;

public class Test {
    public static void main(String[] args) {


        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0] = new Vehicle("Opel Astra", 52, 7);
        vehicles[1] = new Vehicle("BMW M5", 68, 12);
        vehicles[2] = new Vehicle("Scania", 250, 28);
        vehicles[3] = new Vehicle("Mercedes", 280, 27);
        printInfo(vehicles);

    }

    private static void printInfo(Vehicle[] vehicles) {
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println(vehicles[i].getinfo());
        }

    }








}