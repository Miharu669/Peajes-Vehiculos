package dev.vero;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    public void testCalculateBill() {
        Car car = new Car("0107BRH");

        double bill = car.calculateBill();

        assertEquals(100.0, bill, 0.0);
    }

    @Test
    public void testCalculateBill_ValidLicensePlate_ReturnsCorrectBill() {
        Car car = new Car("0107BRH");
        double bill = car.calculateBill();
        assertEquals(100.0, bill, 0.0);
    }

    @Test
    public void testCalculateBill_InvalidLicensePlate_ReturnsDefaultBill() {
        Car car = new Car("invalidLicensePlate");
        double bill = car.calculateBill();
        assertEquals(100.0, bill, 0.0);
    }

    @Test
    public void testCalculateBill_NullLicensePlate_ReturnsDefaultBill() {
        Car car = new Car(null);
        double bill = car.calculateBill();
        assertEquals(100.0, bill, 0.0);
    }

    @Test
    public void testGetLicensePlate() {
        String licensePlate = "6996FHX";
        Car car = new Car(licensePlate);

        assertEquals(licensePlate, car.getLicensePlate());
    }

    @Test
    public void testGetLicensePlate_ValidLicensePlate_ReturnsCorrectLicensePlate() {
        String licensePlate = "6996FHX";
        Car car = new Car(licensePlate);

        assertEquals(licensePlate, car.getLicensePlate());
    }

    @Test
    public void testGetLicensePlate_NullLicensePlate_ReturnsNull() {
        Car car = new Car(null);

        assertNull(car.getLicensePlate());
    }

    @Test
    public void testGetLicensePlate_EmptyLicensePlate_ReturnsEmptyString() {
        Car car = new Car("");

        assertEquals("", car.getLicensePlate());
    }
}
