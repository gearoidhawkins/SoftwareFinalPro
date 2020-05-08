package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TruckTest {

    private Truck t1;

    @BeforeEach
    void init() {
        t1 = new Truck("b", 3, "Flatbed");
    }

    @Test
    void testGetLicenceSuccess()
    {
        assertEquals("b", t1.getLicenceTypeRequired() );
    }

    @Test
    void testGetSeatsSuccess() {
        Truck t2 = new Truck("c1", 3, "low loader");
        assertEquals(3, t2.getNumberOfSeats() );
    }

    @Test
    void testGetTypeSuccess() {
        Truck t3 = new Truck("c", 3, "refrigerated");
        assertEquals("refrigerated", t3.getType() );
    }

    @Test
    void testSetLicenceFail() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> t1.setLicenceTypeRequired("a") );
        assertEquals("not a valid licence type", e.getMessage());
    }

    @Test
    void testSetSeatsHighFail() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> t1.setNumberOfSeats(6) );
        assertEquals("not the correct amount of seats", e.getMessage());
    }

    @Test
    void testSetSeatsLowFail() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> t1.setNumberOfSeats(-6) );
        assertEquals("not the correct amount of seats", e.getMessage());
    }

    @Test
    void testSetTypeFail() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> t1.setType("Boat") );
        assertEquals("not a valid truck type", e.getMessage());
    }

    @Test
    void testReportSuccess() {

        String correctResult =
                "\nManufacturer: " + "null" +
                        "\nReg Plate: " + "null" +
                        "\nEngine Size: " + "0" +
                        "\nColour: " + "null" +
                        "\nMileage: " + "0" +
                        "\nPrice: " + "0.0" +

                        "\nLicence: " + "b" +
                        "\nSeats: " + "3" +
                        "\nType: " + "Flatbed";

        assertEquals(correctResult, t1.generateReport());
    }
}
