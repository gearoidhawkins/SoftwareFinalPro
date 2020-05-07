package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class testClassTest {

    private testClass t1;

    @BeforeEach
    void init()
    {
        t1 = new testClass("johnny", 12345);
    }

    @Test
    void testConstructorNameFail()
    {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new testClass("Tom", 12345) );
        assertEquals("Invalid name length", e.getMessage());
    }

    @Test
    void testConstructorIDFail()
    {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new testClass("Michael", 12) );
        assertEquals("Employee Number should be 5 digits", e.getMessage());
    }
}
