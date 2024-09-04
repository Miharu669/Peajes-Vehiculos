package dev.vero;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class TollStationTest {

    @Test
    public void testTollStation() {
        TollStation tollStation = new TollStation("West Gate", "Madrid");
        assertEquals("West Gate", tollStation.getName());
        assertEquals("Madrid", tollStation.getCity());
        assertEquals(0.0, tollStation.getTollCollected(), 0.01);
        assertTrue(tollStation.getVehicles().isEmpty());
    }

    @Test
    public void testAddVehicle() {
        TollStation tollStation = new TollStation("North Gate", "Leon");
        Car car1 = new Car("1234XYZ");
        Car car2 = new Car("5678BBC");

        tollStation.addVehicle(car1);
        tollStation.addVehicle(car2);
        assertEquals(2, tollStation.getVehicles().size());
        assertTrue(tollStation.getVehicles().contains(car1));
        assertTrue(tollStation.getVehicles().contains(car2));

        assertEquals(200, tollStation.getTollCollected(), 0.01);
    }

    @Test
    public void testSetVehicles() {
        TollStation tollStation = new TollStation("South Gate", "Asturias");
        Vehicle vehicle1 = new Car("ABC123");
        Vehicle vehicle2 = new Car("XYZ789");
        List<Vehicle> vehiclesList = Arrays.asList(vehicle1, vehicle2);

        tollStation.setVehicles(vehiclesList);

        assertEquals(vehiclesList, tollStation.getVehicles());
    }

    @Test
    public void testGetTollCollected(){
        TollStation tollStation = new TollStation("South Gate", "Asturias");
        Truck truck1 = new Truck("1234XYZ", 6);
        tollStation.addVehicle(truck1);
        assertEquals(50, tollStation.getTollCollected(), 0.01);
    }

}
