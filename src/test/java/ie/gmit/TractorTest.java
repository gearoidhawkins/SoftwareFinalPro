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
        assertEquals("Loader", t1.getOtherAttachments());
    }

    @Test
    void testSetPowerFail() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> t1.setHorsePower(20) );
        assertEquals("horse power too low", e.getMessage());
    }

    @Test
    void testSetSpoolFail() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> t1.setNumberOfSpoolValves(7) );
        assertEquals("not a valid spool valve number", e.getMessage());
    }

    @Test
    void testSetAttachmentFail() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> t1.setOtherAttachments("Grass") );
        assertEquals("not a valid attachment", e.getMessage());
    }
}
