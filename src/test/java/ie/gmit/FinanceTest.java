package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FinanceTest {

    private Finance f1;
    private ArrayList<Vehicle> VehicleList = new ArrayList<>();
    private ArrayList<Vehicle> NoVehiclesList = new ArrayList<>();

    @BeforeEach
    void init() {
        VehicleList.add(new Car("Audi", "2010", 1500, "Red", 120123, 5000, true, 5, "Saloon") );
        VehicleList.add(new Bike("BMW", "2020", 2500, "Black", 0, 65000, true, false, 40));
        VehicleList.add(new Truck("Toyota", "2019", 1000, "Silver", 5678, 15000, "C1", 3, "flatbed"));
        f1 = new Finance();
    }

    @Test
    void testPriceCalculationSuccess() {
        assertEquals(85000, f1.calculateTotal(VehicleList));
    }
    @Test
    void testVATCalculationSuccess() {
        assertEquals(19550, f1.calculateVAT(VehicleList));
    }
    @Test
    void testMonthlyPaymentSuccess() {
        assertEquals(2287.03, f1.monthlyPayments(VehicleList, 4, 5));
    }

    @Test
    void testTotalEmptyError() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> f1.calculateTotal(NoVehiclesList) );
        assertEquals("No vehicles in the list", e.getMessage());
    }

    @Test
    void testVATEmptyError() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> f1.calculateVAT(NoVehiclesList) );
        assertEquals("No vehicles in the list", e.getMessage());
    }

    @Test
    void testMonthlyEmptyError() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> f1.monthlyPayments(NoVehiclesList, 0,0) );
        assertEquals("No vehicles in the list", e.getMessage());
    }

    @Test
    void testInterestError() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> f1.monthlyPayments(VehicleList, 4, 20) );
        assertEquals("Interest Rate is too high as its >10%", e.getMessage());
    }
    @Test
    void testLoanLengthFail() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> f1.monthlyPayments(VehicleList, 6, 5) );
        assertEquals("Loan length is too long >5 years", e.getMessage());
    }
}
