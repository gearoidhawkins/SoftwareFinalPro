package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class VehicleTest {

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
    void testSetManufacturerFail()
    {
        Exception e = assertThrows(IllegalArgumentException.class, () -> v1.setManufacturer("Hover") );
        assertEquals("Not a valid manufacturer", e.getMessage());
    }

    @Test
    void testGetYearSuccess()
    {
        assertEquals("2020", v1.getYearOfReg());
    }

    @Test
    void testSetYearFail()
    {
        Exception e = assertThrows(IllegalArgumentException.class, () -> v1.setYearOfReg("2021") );
        assertEquals("Not a valid year", e.getMessage());
    }

    @Test
    void testGetEngineSuccess()
    {
        assertEquals(2000, v1.getEngineSize());
    }

    @Test
    void testSetEngineFail()
    {
        Exception e = assertThrows(IllegalArgumentException.class, () -> v1.setEngineSize(400) );
        assertEquals("Not a valid engine size", e.getMessage());
    }
}
