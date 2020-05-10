/*
Software Engineering with Test
Delivery Pipeline Project

Author:  Gearoid Hawkins
Email: G00308088@gmit.ie
Date:  08/05/2020

Description:
    JUnit tests for the SalesPerson class
 */
package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalesPersonTest {

    private SalesPerson s1;

    @BeforeEach
    void init() {
        s1 = new SalesPerson("Mary", "Walsh", "12345", "MWalsh@WalshMotors.com", true);
    }

    @Test
    void testGetFirstNameSuccess() {
        assertEquals("Mary", s1.getFirstName());
    }

    @Test
    void testGetLastNameSuccess() {
        assertEquals("Walsh", s1.getLastName());
    }

    @Test
    void testGetIDSuccess() {
        assertEquals("12345", s1.getID());
    }

    @Test
    void testGetEmailSuccess() {
        assertEquals("MWalsh@WalshMotors.com", s1.getEmail());
    }

    @Test
    void testGetAdminSuccess() {
        assertTrue(s1.isHasAdminRights());
    }

    @Test
    void testSetFirstNameFail() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> s1.setFirstName("c") );
        assertEquals("First Name must be longer than 1 character", e.getMessage());
    }

    @Test
    void testSetLastNameFail() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> s1.setLastName("c") );
        assertEquals("Last Name must be longer than 1 character", e.getMessage());
    }

    @Test
    void testSetIDFail() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> s1.setID("123") );
        assertEquals("ID number must be 5 digits long", e.getMessage());
    }

    @Test
    void testSetEmailFail() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> s1.setEmail("MWalsh@gmail.com") );
        assertEquals("Invalid email: must be @WalshMotors.com", e.getMessage());
    }

}
