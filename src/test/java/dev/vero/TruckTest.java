package dev.vero;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class TruckTest {

    @Test
    public void testTruck() {
        Truck truck = new Truck("1234XYZ", 4);
        assertEquals("1234XYZ", truck.getLicensePlate());
        assertEquals(4, truck.getNumAxis());
    }

    @Test
    public void testGetNumAxis() {
        Truck truck = new Truck("1234XYZ", 4);
        assertEquals(4, truck.getNumAxis());
    }

    @Test
    public void testSetNumAxis() {
        Truck truck = new Truck("1234XYZ", 4);
        truck.setNumAxis(5);
        assertEquals(5, truck.getNumAxis());
    }

    @Test
    public void testCalculateBill() {
        Truck truck = new Truck("1234XYZ", 4);
        double bill = truck.calculateBill();
        assertEquals(50.0, bill, 0.0);
    }

    @Test
    public void testCalculateBill_ValidLicensePlate_ReturnsCorrectBill() {
        Truck truck = new Truck("1234XYZ", 4);
        double bill = truck.calculateBill();
        assertEquals(50.0, bill, 0.0);
    }

    @Test
    public void testCalculateBill_InvalidLicensePlate_ReturnsDefaultBill() {
        Truck truck = new Truck("invalidLicensePlate", 4);
        double bill = truck.calculateBill();
        assertEquals(50.0, bill, 0.0);
    }

    @Test
    public void testCalculateBill_NullLicensePlate_ReturnsDefaultBill() {
        Truck truck = new Truck(null, 4);
        double bill = truck.calculateBill();
        assertEquals(50.0, bill, 0.0);
    }

    @Test
    public void testGetLicensePlate() {
        Truck truck = new Truck("1234XYZ", 4);
        String licensePlate = truck.getLicensePlate();
        assertEquals("1234XYZ", licensePlate);
    }

    @Test
    public void testGetLicensePlate_ValidLicensePlate() {
        Truck truck = new Truck("1234XYZ", 4);
        String licensePlate = truck.getLicensePlate();
        assertEquals("1234XYZ", licensePlate);
    }

    @Test
    public void testGetLicensePlate_InvalidLicensePlate() {
        Truck truck = new Truck("invalidLicensePlate", 4);
        String licensePlate = truck.getLicensePlate();
        assertEquals("invalidLicensePlate", licensePlate);
    }

    @Test
    public void testGetLicensePlate_NullLicensePlate_ReturnsNull() {
        Truck truck = new Truck(null, 4);
        assertNull(truck.getLicensePlate());
    }

    @Test
    public void testGetLicensePlate_EmptyLicensePlate_ReturnsEmptyString() {
        Truck truck = new Truck("", 4);
        assertEquals("", truck.getLicensePlate());
    }
}
