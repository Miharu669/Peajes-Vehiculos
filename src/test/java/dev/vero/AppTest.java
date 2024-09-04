package dev.vero;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testApp() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        App.main(new String[]{});

        String output = new String(out.toByteArray());

        assertTrue(output.contains("North Gate")); 
        assertTrue(output.contains("Leon")); 
    }

    @Test
    public void testVehicleAddition() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        App.main(new String[]{});

        String output = new String(out.toByteArray());

        assertTrue(output.contains("ABC123")); 
        assertTrue(output.contains("XYZ789")); 
        assertTrue(output.contains("DEF456")); 
        assertTrue(output.contains("GHI789")); 
        assertTrue(output.contains("ABC123")); 
        assertTrue(output.contains("XYZ789")); 
    }

    @Test
    public void testTotalTollCalculation() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        App.main(new String[]{});

        String output = new String(out.toByteArray());

        
        assertTrue(output.contains("Total Toll Collected: $800.0"));
    }

    @Test
    public void testAppInput() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testDetailedAppOutput() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        App.main(new String[] {});

        String output = new String(out.toByteArray());

        assertTrue(output.contains("North Gate"));
        assertTrue(output.contains("Leon"));
        assertTrue(output.contains("ABC123"));
        assertTrue(output.contains("XYZ789"));
        assertTrue(output.contains("DEF456"));
        assertTrue(output.contains("GHI789"));

        assertTrue(output.contains("Total Toll Collected: $800"));
    }
}
