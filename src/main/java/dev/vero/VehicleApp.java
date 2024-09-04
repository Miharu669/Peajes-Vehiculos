package dev.vero;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleApp {
    public List<Vehicle> vehicles = new ArrayList<>();

    public static void main(String[] args) {
        VehicleApp app = new VehicleApp();
        app.run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Toll Management App ---");
            System.out.println("1. Add Car");
            System.out.println("2. Add Motorcycle");
            System.out.println("3. Add Truck");
            System.out.println("4. View Vehicles");
            System.out.println("5. Calculate Total Bill");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addCar(scanner);
                    break;
                case 2:
                    addMotorcycle(scanner);
                    break;
                case 3:
                    addTruck(scanner);
                    break;
                case 4:
                    viewVehicles();
                    break;
                case 5:
                    calculateTotalBill();
                    break;
                case 6:
                    System.out.println("Exiting the application.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public void addCar(Scanner scanner) {
        System.out.print("Enter the license plate: ");
        String licensePlate = scanner.nextLine();
        Car car = new Car(licensePlate);
        vehicles.add(car);
        System.out.println("Car added successfully.");
    }

    public void addMotorcycle(Scanner scanner) {
        System.out.print("Enter the license plate: ");
        String licensePlate = scanner.nextLine();
        Motorcycle motorcycle = new Motorcycle(licensePlate);
        vehicles.add(motorcycle);
        System.out.println("Motorcycle added successfully.");
    }

    public void addTruck(Scanner scanner) {
        System.out.print("Enter the license plate: ");
        String licensePlate = scanner.nextLine();
        System.out.print("Enter the number of axies: ");
        int numAxles = scanner.nextInt();
        scanner.nextLine(); 
        Truck truck = new Truck(licensePlate, numAxles);
        vehicles.add(truck);
        System.out.println("Truck added successfully with " + numAxles + " axies.");
    }

    public void viewVehicles() {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles in the list.");
            return;
        }
        System.out.println("\nList of vehicles:");
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Truck) {
                Truck truck = (Truck) vehicle;
                System.out.println("License Plate: " + truck.getLicensePlate() + ", Axis: " + truck.getNumAxis());
            } else {
                System.out.println("License Plate: " + vehicle.getLicensePlate());
            }
        }
    }

    public void calculateTotalBill() {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles to calculate the bill.");
            return;
        }
        double totalBill = 0;
        for (Vehicle vehicle : vehicles) {
            totalBill += vehicle.calculateBill();
        }
        System.out.println("Total Bill: $" + totalBill);
    }
}
