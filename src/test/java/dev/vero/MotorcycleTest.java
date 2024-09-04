package dev.vero;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class MotorcycleTest {

    @Test
    public void testCalculateBill() {
        Motorcycle motorcycle = new Motorcycle("1234XYZ");

        double bill = motorcycle.calculateBill();

        assertEquals(50.0, bill, 0.0);
    }

    @Test
    public void testCalculateBill_ValidLicensePlate_ReturnsCorrectBill() {
        Motorcycle motorcycle = new Motorcycle("1234XYZ");
        double bill = motorcycle.calculateBill();
        assertEquals(50.0, bill, 0.0);
    }

    @Test
    public void testCalculateBill_InvalidLicensePlate_ReturnsDefaultBill() {
        Motorcycle motorcycle = new Motorcycle("InvalidLicensePlate");
        double bill = motorcycle.calculateBill();
        assertEquals(50.0, bill, 0.0);
    }

    @Test
    public void testCalculateBill_NullLicensePlate_ReturnsDefaultBill() {
        Motorcycle motorcycle = new Motorcycle(null);
        double bill = motorcycle.calculateBill();
        assertEquals(50.0, bill, 0.0);
    }

    @Test
    public void testCalculateBill_EmptyLicensePlate_ReturnsDefaultBill() {
        Motorcycle motorcycle = new Motorcycle("");
        double bill = motorcycle.calculateBill();
        assertEquals(50.0, bill, 0.0);
    }

    @Test
    public void testGetLicensePlate() {
        Motorcycle motorcycle = new Motorcycle("1234XYZ");
        String licensePlate = motorcycle.getLicensePlate();

        assertEquals("1234XYZ", licensePlate);
    }

        @Test
    public void testGetLicensePlate_ValidLicensePlate() {
        Motorcycle motorcycle = new Motorcycle("1234XYZ");
        String licensePlate = motorcycle.getLicensePlate();
        assertEquals("1234XYZ", licensePlate);
    }

    @Test
    public void testGetLicensePlate_NullLicensePlate() {
        Motorcycle motorcycle = new Motorcycle(null);
        assertNull(motorcycle.getLicensePlate());
    }

    @Test
    public void testGetLicensePlate_EmptyLicensePlate() {
        Motorcycle motorcycle = new Motorcycle("");
        assertEquals("", motorcycle.getLicensePlate());
    }

    @Test
    public void testGetLicensePlate_WhitespaceLicensePlate() {
        Motorcycle motorcycle = new Motorcycle("   ");
        assertEquals("   ", motorcycle.getLicensePlate());
    }

}
