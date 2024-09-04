package dev.vero;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        TollStation tollStation = new TollStation("North Gate", "Leon");

        Car car1 = new Car("ABC123");
        Car car2 = new Car("XYZ789");
        Motorcycle motorcycle1 = new Motorcycle("DEF456");
        Motorcycle motorcycle2 = new Motorcycle("GHI789");
        Truck truck1 = new Truck("ABC123", 4);
        Truck truck2 = new Truck("XYZ789", 6);

        tollStation.addVehicle(car1);
        tollStation.addVehicle(car2);
        tollStation.addVehicle(motorcycle1);
        tollStation.addVehicle(motorcycle2);
        tollStation.addVehicle(truck1);
        tollStation.addVehicle(truck2);

        tollStation.printReport();
    }

}
