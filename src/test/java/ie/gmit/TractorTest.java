package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TractorTest {

    private Tractor t1;

    @BeforeEach
    void init() {
        t1 = new Tractor(150, 3, true, "Loader");
    }

    @Test
    void testGetPowerSuccess() {
        assertEquals(150, t1.getHorsePower());
    }

    @Test
    void testGetSpoolsSuccess() {
        assertEquals(3, t1.getNumberOfSpoolValves());
    }

    @Test
    void testIs4WDSuccess() {
        assertEquals(true, t1.isIs4WD());
    }

    @Test
    void testGetAttachmentsSuccess() {
        Tractor t2 = new Tractor(200, 2, true, "Front Linkage");
        assertEquals("Front Linkage", t2.getOtherAttachments());
    }

    @Test
    void testSetPowerFail() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> t1.setHorsePower(20) );
        assertEquals("horse power too low", e.getMessage());
    }


    @Test
    void testSetSpoolHighFail() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> t1.setNumberOfSpoolValves(7) );
        assertEquals("not a valid spool valve number", e.getMessage());
    }

    @Test
    void testSetSpoolLowFail() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> t1.setNumberOfSpoolValves(0) );
        assertEquals("not a valid spool valve number", e.getMessage());
    }

    @Test
    void testSetAttachmentFail() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> t1.setOtherAttachments("Grass") );
        assertEquals("not a valid attachment", e.getMessage());
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

                "\nHorsePower: " + "150" +
                "\nSpools: " + "3" +
                "\n4WD: " + "yes" +
                "\nAttachments: " + "Loader";

        assertEquals(correctResult, t1.generateReport());
    }

    @Test
    void testReportNoSuccess() {

        t1.setIs4WD(false);
        String correctResult =
                "\nManufacturer: " + "null" +
                        "\nReg Plate: " + "null" +
                        "\nEngine Size: " + "0" +
                        "\nColour: " + "null" +
                        "\nMileage: " + "0" +
                        "\nPrice: " + "0.0" +

                        "\nHorsePower: " + "150" +
                        "\nSpools: " + "3" +
                        "\n4WD: " + "no" +
                        "\nAttachments: " + "Loader";

        assertEquals(correctResult, t1.generateReport());
    }
}
