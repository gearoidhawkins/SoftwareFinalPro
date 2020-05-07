package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TruckTest {

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
    void testGetSeatsSuccess()
    {
        assertEquals(3, t1.getNumberOfSeats() );
    }

    @Test
    void testGetTypeSuccess()
    {
        assertEquals("Flatbed", t1.getType() );
    }

    @Test
    void testSetLicenceFail() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> t1.setLicenceTypeRequired("a") );
        assertEquals("not a valid licence type", e.getMessage());
    }

    @Test
    void testSetSeatsFail() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> t1.setNumberOfSeats(6) );
        assertEquals("not the correct amount of seats", e.getMessage());
    }

    @Test
    void testSetTypeFail() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> t1.setType("Boat") );
        assertEquals("not a valid truck type", e.getMessage());
    }
}
