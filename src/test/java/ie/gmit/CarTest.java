package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    private Car c1;

    @BeforeEach
    void init()
    {
        c1 = new Car(true, 5, "Saloon");
    }

    @Test
    void testisRightSuccess()
    {
        Car c2 = new Car(true, 3, "Hatchback");
        assertTrue( c2.isRightHandDrive());
    }

    @Test
    void testDoorsSuccess()
    {
        assertEquals(5, c1.getNumberOfDoors());
    }

    @Test
    void testBodyTypeSuccess() {
        Car c3 = new Car(true, 3, "Estate");
        assertEquals("Estatehgfg", c3.getBodyType());
    }

    @Test
    void testSetDoorsFail() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> c1.setNumberOfDoors(8) );
        assertEquals("Too many doors", e.getMessage());
    }

    @Test
    void testSetBodyTypeFail() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> c1.setBodyType("boat") );
        assertEquals("Not a valid body type", e.getMessage());
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

                        "\nDoors: " + "5" +
                        "\nBody type: " + "Saloon" +
                        "\nRight Hand drive: " + "yes";

        assertEquals(correctResult, c1.generateReport());
    }

    @Test
    void testReportNoSuccess() {

        c1.setRightHandDrive(false);

        String correctResult =
                "\nManufacturer: " + "null" +
                        "\nReg Plate: " + "null" +
                        "\nEngine Size: " + "0" +
                        "\nColour: " + "null" +
                        "\nMileage: " + "0" +
                        "\nPrice: " + "0.0" +

                        "\nDoors: " + "5" +
                        "\nBody type: " + "Saloon" +
                        "\nRight Hand drive: " + "no";

        assertEquals(correctResult, c1.generateReport());
    }
}
