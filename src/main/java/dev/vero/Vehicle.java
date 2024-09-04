package dev.vero;

public abstract class Vehicle {
private String licensePlate;

public Vehicle(String licensePlate) {
    this.licensePlate = licensePlate;
}

public String getLicensePlate() {
    return licensePlate;
}

public abstract double calculateBill();
}
