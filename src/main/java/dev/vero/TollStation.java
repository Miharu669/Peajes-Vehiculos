package dev.vero;

import java.util.ArrayList;
import java.util.List;

public class TollStation {
    private String name;
    private String city;
    private double totalTollCollected;
    private List<Vehicle> vehicles;

    public TollStation(String name, String city) {
        this.name = name;
        this.city = city;
        this.totalTollCollected = 0;
        this.vehicles = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public double getTollCollected() {
        return totalTollCollected;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        totalTollCollected += vehicle.calculateBill();
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public void printReport() {
        System.out.println("Toll Station: " + name);
        System.out.println("City: " + city);
        System.out.println("Total Toll Collected: $" + totalTollCollected);
        System.out.println("Vehicles:");
        for (Vehicle vehicle : vehicles) {
            System.out.println(" - License Plate: " + vehicle.getLicensePlate() + ", Bill: $" + vehicle.calculateBill());
        }
    }

}
