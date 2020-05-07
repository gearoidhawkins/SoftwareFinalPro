package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CarTest {

    private Car c1;

    @BeforeEach
    void init()
    {
        c1 = new Car(true, 5, "Saloon");
    }

    @Test
    void testisRightSuccess()
    {
        assertEquals(true, c1.isRightHandDrive());
    }

    @Test
    void testDoorsSuccess()
    {
        assertEquals(5, c1.getNumberOfDoors());
    }

    @Test
    void testBodyTypeSuccess()
    {
        assertEquals("Saloon", c1.getBodyType());
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
}
