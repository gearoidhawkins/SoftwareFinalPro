/*
Software Engineering with Test
Delivery Pipeline Project

Author:  Aaron McKinley
Email: G00299523@gmit.ie
Date:  07/05/2020

Description:
    JUnit tests for the Organise class
 */
package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class OrganiseTest {

    private Organise O1;
    private ArrayList<Vehicle> VehicleList = new ArrayList<>();
    private ArrayList<Vehicle> TestList = new ArrayList<>();

    @BeforeEach
    void init() {
        VehicleList.add(new Vehicle("Toyota", "10-D-1234", 1500, "Red", 120123, 5000));
        VehicleList.add(new Vehicle("BMW", "20-MO-4567", 2500, "Black", 0, 65000));
        VehicleList.add(new Vehicle("Audi", "19-G-9999", 1000, "Silver", 5678, 15000));
        O1 = new Organise();
    }
    @Test
    void testNameSortingForward() {
        int index = 0;
        ArrayList<Vehicle> sorted = O1.sortName(VehicleList, "Forward");
        ArrayList<String> correct = new ArrayList<>();
        correct.add("Audi");
        correct.add("BMW");
        correct.add("Toyota");
        for(Vehicle v : sorted){
            assertEquals(correct.get(index), v.getManufacturer());
            index++;
        }
    }
    @Test
    void testNameSortingBackward() {
        int index = 0;
        ArrayList<Vehicle> sorted = O1.sortName(VehicleList, "Backwards");
        ArrayList<String> correct = new ArrayList<>();
        correct.add("Toyota");
        correct.add("BMW");
        correct.add("Audi");
        for(Vehicle v : sorted){
            assertEquals(correct.get(index), v.getManufacturer());
            index++;
        }
    }
    @Test
    void testNameFilterError() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> O1.sortName(VehicleList, "test") );
        assertEquals("No filter chosen", e.getMessage());
    }
    @Test
    void testEngineSortingHighest() {
        int index = 0;
        ArrayList<Vehicle> sorted = O1.sortEngine(VehicleList, "Highest");
        ArrayList<Integer> correct = new ArrayList<>();
        correct.add(2500);
        correct.add(1500);
        correct.add(1000);
        for(Vehicle v : sorted){
            assertEquals(correct.get(index), v.getEngineSize());
            index++;
        }
    }
    @Test
    void testEngineSortingLowest() {
        int index = 0;
        ArrayList<Vehicle> sorted = O1.sortEngine(VehicleList, "Lowest");
        ArrayList<Integer> correct = new ArrayList<>();
        correct.add(1000);
        correct.add(1500);
        correct.add(2500);
        for(Vehicle v : sorted){
            assertEquals(correct.get(index), v.getEngineSize());
            index++;
        }
    }
    @Test
    void testEngineFilterError() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> O1.sortEngine(VehicleList, "test") );
        assertEquals("No filter chosen", e.getMessage());
    }
    @Test
    void testPriceSortingHighest() {
        int index = 0;
        ArrayList<Vehicle> sorted = O1.sortPrice(VehicleList, "Highest");
        ArrayList<Double> correct = new ArrayList<>();
        correct.add(65000.0);
        correct.add(15000.0);
        correct.add(5000.0);
        for(Vehicle v : sorted){
            assertEquals(correct.get(index), v.getPrice());
            index++;
        }
    }
    @Test
    void testPriceSortingLowest() {
        int index = 0;
        ArrayList<Vehicle> sorted = O1.sortPrice(VehicleList, "Lowest");
        ArrayList<Double> correct = new ArrayList<>();
        correct.add(5000.0);
        correct.add(15000.0);
        correct.add(65000.0);
        for(Vehicle v : sorted){
            assertEquals(correct.get(index), v.getPrice());
            index++;
        }
    }
    @Test
    void testPriceFilterError() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> O1.sortPrice(VehicleList, "test") );
        assertEquals("No filter chosen", e.getMessage());
    }
    @Test
    void testMilesSortingHighest() {
        int index = 0;
        ArrayList<Vehicle> sorted = O1.sortMiles(VehicleList, "Highest");
        ArrayList<Integer> correct = new ArrayList<>();
        correct.add(120123);
        correct.add(5678);
        correct.add(0);
        for(Vehicle v : sorted){
            assertEquals(correct.get(index), v.getMileage());
            index++;
        }
    }
    @Test
    void testMilesSortingLowest() {
        int index = 0;
        ArrayList<Vehicle> sorted = O1.sortMiles(VehicleList, "Lowest");
        ArrayList<Integer> correct = new ArrayList<>();
        correct.add(0);
        correct.add(5678);
        correct.add(120123);
        for(Vehicle v : sorted){
            assertEquals(correct.get(index), v.getMileage());
            index++;
        }
    }
    @Test
    void testMilageFilterError() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> O1.sortMiles(VehicleList, "test") );
        assertEquals("No filter chosen", e.getMessage());
    }
}
