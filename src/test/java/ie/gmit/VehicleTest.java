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
}
