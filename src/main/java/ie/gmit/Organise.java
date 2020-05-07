package ie.gmit;

import java.util.ArrayList;
import java.util.Collections;

public class Organise {
    public ArrayList<Vehicle> sort(ArrayList<Vehicle> myList, String sortType) {
        ArrayList<Vehicle> orderedVehicles = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Double> doubles = new ArrayList<>();
        ArrayList<Integer> ints = new ArrayList<>();
        int arraySize;
        if (myList.isEmpty()) {
            throw new IllegalArgumentException("No vehicles in the list");
        } else {
            //put the vehicle make into a list
            for (Vehicle v : myList) {
                switch (sortType) {
                    case "Make":
                        names.add(v.getManufacturer());
                        break;
                    case "Engine":
                        ints.add(v.getEngineSize());
                        break;
                    case "Miles":
                        ints.add(v.getMileage());
                        break;
                    case "Price":
                        doubles.add(v.getPrice());
                        break;
                }
            }

            if (names.isEmpty() && doubles.isEmpty() && ints.isEmpty() == false) {
                Collections.sort(ints, Collections.reverseOrder());
                arraySize = ints.size();
            } else if (names.isEmpty() && ints.isEmpty() && doubles.isEmpty() == false) {
                Collections.sort(doubles, Collections.reverseOrder());
                arraySize = doubles.size();
            } else if (ints.isEmpty() && doubles.isEmpty() && names.isEmpty() == false) {
                Collections.sort(names);
                arraySize = names.size();
            } else {
                throw new IllegalArgumentException("Nothing add to array for sorting");
            }

            for (int i = 0; i < arraySize; i++) {
                for (Vehicle v : myList) {
                    switch (sortType) {
                        case "Make":
                            String make = v.getManufacturer();
                            if (names.get(i) == make) {
                                orderedVehicles.add(v);
                            }
                            break;
                        case "Engine":
                            int engine = v.getEngineSize();
                            if (ints.get(i) == engine) {
                                orderedVehicles.add(v);
                            }
                            break;
                        case "Miles":
                            if (ints.get(i) == v.getMileage()) {
                                orderedVehicles.add(v);
                            }
                            break;
                        case "Price":
                            if (doubles.get(i) == v.getPrice()) {
                                orderedVehicles.add(v);
                            }
                            break;
                    }
                }
            }
            return orderedVehicles;
        }
    }
}
