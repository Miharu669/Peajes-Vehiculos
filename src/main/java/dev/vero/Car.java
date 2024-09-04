package dev.vero;

public class Car extends Vehicle {

    private static final double CAR_RATE = 100;

    public Car(String licensePlate) {
        super(licensePlate);
    }

    @Override
    public double calculateBill() {
        return CAR_RATE;
    }

   
}
