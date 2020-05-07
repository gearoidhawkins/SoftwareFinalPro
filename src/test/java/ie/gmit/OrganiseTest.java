package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class OrganiseTest {

    private Organise O1;
    ArrayList<Vehicle> VehicleList = new ArrayList<Vehicle>();
    ArrayList<Vehicle> TestList = new ArrayList<Vehicle>();

    @BeforeEach
    void init() {
        VehicleList.add(new Vehicle("Toyota", "2010", 1500, "Red", 120123, 5000));
        VehicleList.add(new Vehicle("BMW", "2020", 2500, "Black", 0, 65000));
        VehicleList.add(new Vehicle("Audi", "2019", 1000, "Silver", 5678, 15000));
        O1 = new Organise();
    }

    @Test
    void testNameSorting() {
        int index = 0;
        ArrayList<Vehicle> sorted = O1.sort(VehicleList, "Make");
        ArrayList<String> correct = new ArrayList<String>();
        correct.add("Audi");
        correct.add("BMW");
        correct.add("Toyota");
        for(Vehicle v : sorted){
            assertEquals(correct.get(index), v.getManufacturer());
            index++;
        }
    }
    @Test
    void testEngineSorting() {
        int index = 0;
        ArrayList<Vehicle> sorted = O1.sort(VehicleList, "Engine");
        ArrayList<Integer> correct = new ArrayList<Integer>();
        correct.add(2500);
        correct.add(1500);
        correct.add(1000);
        for(Vehicle v : sorted){
            assertEquals(correct.get(index), v.getEngineSize());
            index++;
        }
    }
    @Test
    void testPriceSorting() {
        int index = 0;
        ArrayList<Vehicle> sorted = O1.sort(VehicleList, "Price");
        ArrayList<Double> correct = new ArrayList<Double>();
        correct.add(65000.0);
        correct.add(15000.0);
        correct.add(5000.0);
        for(Vehicle v : sorted){
            assertEquals(correct.get(index), v.getPrice());
            index++;
        }
    }
    @Test
    void testMilesSorting() {
        int index = 0;
        ArrayList<Vehicle> sorted = O1.sort(VehicleList, "Miles");
        ArrayList<Integer> correct = new ArrayList<Integer>();
        correct.add(120123);
        correct.add(5678);
        correct.add(0);
        for(Vehicle v : sorted){
            assertEquals(correct.get(index), v.getMileage());
            index++;
        }
    }
//    @Test
//    void testVATCalculation() {
//        assertEquals(19550, O1.calculateVAT(VehicleList));
//    }
//    @Test
//    void testMonthlyPayment() {
//        assertEquals(1859.38, f1.monthlyPayments(VehicleList, 4, 5));
//    }
//
//    @Test
//    void testListError() {
//        Exception e = assertThrows(IllegalArgumentException.class, () -> f1.calculateTotal(NoVehiclesList) );
//        assertEquals("No vehicles in the list", e.getMessage());
//    }
//    @Test
//    void testInterestError() {
//        Exception e = assertThrows(IllegalArgumentException.class, () -> f1.monthlyPayments(VehicleList, 4, 20) );
//        assertEquals("Interest Rate is too high as its >10%", e.getMessage());
//    }
//    @Test
//    void testLoanLength() {
//        Exception e = assertThrows(IllegalArgumentException.class, () -> f1.monthlyPayments(VehicleList, 6, 5) );
//        assertEquals("Loan length is too long >5 years", e.getMessage());
//    }
}
