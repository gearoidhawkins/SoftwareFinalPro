package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class VehicleTest {

    private Vehicle v1;

    @BeforeEach
    void init()
    {
        v1 = new Vehicle("Audi","2020", 2000, "Red", 200000, 10000);
    }

    @Test
    void testGetManufacturerSuccess()
    {
        assertEquals("Audi", v1.getManufacturer());
    }

    @Test
    void testGetYearSuccess()
    {
        assertEquals("2020", v1.getRegPlate());
    }

    @Test
    void testGetEngineSuccess()
    {
        assertEquals(2000, v1.getEngineSize());
    }

    @Test
    void testGetColorSuccess() {
        assertEquals("Red", v1.getColour());
    }

    @Test
    void testGetMileageSuccess() {
        assertEquals(200000, v1.getMileage());
    }

    @Test
    void testGetPriceSuccess() {
        assertEquals(10000, v1.getPrice());
    }

    @Test
    void testSetManufacturerFail() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> v1.setManufacturer("Hover") );
        assertEquals("Not a valid manufacturer", e.getMessage());
    }

    @Test
    void testSetYearFail() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> v1.setRegPlate("2021") );
        assertEquals("Not a valid year", e.getMessage());
    }

    @Test
    void testSetEngineFail() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> v1.setEngineSize(400) );
        assertEquals("Not a valid engine size", e.getMessage());
    }

    @Test
    void testSetColorFail() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> v1.setColour("Re") );
        assertEquals("Not a valid colour", e.getMessage());
    }

    @Test
    void testSetMileageFail() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> v1.setMileage(-10) );
        assertEquals("Not a valid mileage", e.getMessage());
    }

    @Test
    void testSetPriceFail() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> v1.setPrice(-10) );
        assertEquals("Not a valid price", e.getMessage());
    }

    @Test
    void testReportSuccess() {
        String correctResult =
                "\nManufacturer: " + "Audi" +
                        "\nReg Plate: " + "2020" +
                        "\nEngine Size: " + "2000" +
                        "\nColour: " + "Red" +
                        "\nMileage: " + "200000" +
                        "\nPrice: " + "10000.0"
                ;

        assertEquals(correctResult, v1.generateReport());
    }
}
