package dev.vero;

public class Motorcycle extends Vehicle {

    private static final double MOTORCYCLE_RATE = 50;

    public Motorcycle(String licensePlate) {
        super(licensePlate);
    }

    @Override
    public double calculateBill() {
        return MOTORCYCLE_RATE;
    }
}
