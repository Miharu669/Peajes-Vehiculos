package dev.vero;

public class Truck extends Vehicle { 
    
    private static final double TRUCK_RATE = 50;

    private int numAxis;

    public Truck(String licensePlate, int numAxis) {
        super(licensePlate);
        this.numAxis = numAxis;
    }

    public int getNumAxis() {
        return numAxis;
    }

    public void setNumAxis(int numAxis) {
        this.numAxis = numAxis;
    }

    @Override
    public double calculateBill() {
        return TRUCK_RATE * numAxis;
    }
}
