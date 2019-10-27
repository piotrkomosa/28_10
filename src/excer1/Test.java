package excer1;

public class Test {
    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0]= new Car("Opel Astra", 56 , 7,false);
        vehicles[1] = new Car("BMW M5", 80, 12,true);
        vehicles[2] = new Truck("Scania", 280, 22,true, 8000);
        vehicles[3] = new Truck("Mercedes", 300, 24,true, 7500);
        printInfo(vehicles);
        System.out.println();
        System.out.println("zasięg wynosi odpowiednio: ");
        getRange(vehicles);

    }
    private static void printInfo(Vehicle[] vehicles) {
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println(vehicles[i].getinfo());
        }
    }
    private static void getRange(Vehicle[] vehicles) {
        for (int i = 0; i < vehicles.length; i++) {
            System.out.printf("%.0f%n",vehicles[i].range());
        }
    }
}