package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BikeTest {

    private Bike b1;

    @BeforeEach
    void init() {
        b1 = new Bike(true, true, 30);
    }

    @Test
    void testHasBoxSuccess() {
        assertEquals(true, b1.isHasTransportBox());
    }

    @Test
    void testHasSeatSuccess() {
        assertEquals(true, b1.isHasPassengerSeat());
    }

    @Test
    void testGetSpeedSuccess() {
        assertEquals(30, b1.getTopSpeed());
    }

    @Test
    void testSetSpeedFail() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> b1.setTopSpeed(-10) );
        assertEquals("speed must be a positive number", e.getMessage());
    }

    @Test
    void testReportYesSuccess() {

        String correctResult =
                "\nManufacturer: " + "null" +
                        "\nReg Plate: " + "null" +
                        "\nEngine Size: " + "0" +
                        "\nColour: " + "null" +
                        "\nMileage: " + "0" +
                        "\nPrice: " + "0.0" +

                        "\nTop Speed: " + "30" +
                        "\nTransport Box: " + "yes" +
                        "\nRPassengerSeat: " + "yes";

        assertEquals(correctResult, b1.generateReport());
    }

    @Test
    void testReportNoSuccess() {

        b1.setHasPassengerSeat(false);
        b1.setHasTransportBox(false);
        String correctResult =
                "\nManufacturer: " + "null" +
                        "\nReg Plate: " + "null" +
                        "\nEngine Size: " + "0" +
                        "\nColour: " + "null" +
                        "\nMileage: " + "0" +
                        "\nPrice: " + "0.0" +

                        "\nTop Speed: " + "30" +
                        "\nTransport Box: " + "no" +
                        "\nRPassengerSeat: " + "no";

        assertEquals(correctResult, b1.generateReport());
    }
}
