package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FinanceTest {

    private Finance f1;
    ArrayList<Vehicle> VehicleList = new ArrayList<Vehicle>();
    ArrayList<Vehicle> NoVehiclesList = new ArrayList<Vehicle>();

    @BeforeEach
    void init() {
        VehicleList.add(new Vehicle("Audi", "2010", 1500, "Red", 120123, 5000));
        VehicleList.add(new Vehicle("BMW", "2020", 2500, "Black", 0, 65000));
        VehicleList.add(new Vehicle("Toyota", "2019", 1000, "Silver", 5678, 15000));
        f1 = new Finance();
    }

    @Test
    void testPriceCalculation() {
        assertEquals(85000, f1.calculateTotal(VehicleList));
    }
    @Test
    void testVATCalculation() {
        assertEquals(19550, f1.calculateVAT(VehicleList));
    }
    @Test
    void testMonthlyPayment() {
        assertEquals(1859.38, f1.monthlyPayments(VehicleList, 4, 5));
    }

    @Test
    void testListError() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> f1.calculateTotal(NoVehiclesList) );
        assertEquals("No vehicles in the list", e.getMessage());
    }
    @Test
    void testInterestError() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> f1.monthlyPayments(VehicleList, 4, 20) );
        assertEquals("Interest Rate is too high as its >10%", e.getMessage());
    }
    @Test
    void testLoanLength() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> f1.monthlyPayments(VehicleList, 6, 5) );
        assertEquals("Loan length is too long >5 years", e.getMessage());
    }
}
