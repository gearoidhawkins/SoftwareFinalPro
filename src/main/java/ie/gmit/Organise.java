/*
Software Engineering with Test
Delivery Pipeline Project

Author:  Aaron McKinley
Email: G00299523@gmit.ie
Date:  07/05/2020

Description:
    Organise class to be used with the base classes.
 */
package ie.gmit;

import java.util.ArrayList;
import java.util.Collections;

public class Organise {
    private ArrayList<Vehicle> orderedVehicles = new ArrayList<>();

    public ArrayList<Vehicle> sortName(ArrayList<Vehicle> myList, String order) {
        ArrayList<String> names = new ArrayList<>();
        //gets the names into an array
        for (Vehicle v : myList) {
            names.add(v.getManufacturer());
        }

        //sorts them ascending or descending
        if (order == "Forward") {
            Collections.sort(names);
        } else if (order == "Backwards") {
            Collections.sort(names, Collections.reverseOrder());
        } else {
            throw new IllegalArgumentException("No filter chosen");
        }

        //puts the object in the right order in a new list
        for (String s : names) {
            for (Vehicle v : myList) {
                if (s == v.getManufacturer()) {
                    orderedVehicles.add(v);
                }
            }
        }
        return orderedVehicles;
    }

    public ArrayList<Vehicle> sortMiles(ArrayList<Vehicle> myList, String order) {
        ArrayList<Integer> miles = new ArrayList<>();
        for (Vehicle v : myList) {
            miles.add(v.getMileage());
        }

        if (order == "Lowest") {
            Collections.sort(miles);
        } else if (order == "Highest") {
            Collections.sort(miles, Collections.reverseOrder());
        } else {
            throw new IllegalArgumentException("No filter chosen");
        }

        for (int i : miles) {
            for (Vehicle v : myList) {
                if (i == v.getMileage()) {
                    orderedVehicles.add(v);
                }
            }
        }
        return orderedVehicles;
    }

    public ArrayList<Vehicle> sortEngine(ArrayList<Vehicle> myList, String order) {
        ArrayList<Integer> engine = new ArrayList<>();

        for (Vehicle v : myList) {
            engine.add(v.getEngineSize());
        }

        if (order == "Lowest") {
            Collections.sort(engine);
        } else if (order == "Highest") {
            Collections.sort(engine, Collections.reverseOrder());
        } else {
            throw new IllegalArgumentException("No filter chosen");
        }

        for (int i : engine) {
            for (Vehicle v : myList) {
                if (i == v.getEngineSize()) {
                    orderedVehicles.add(v);
                }
            }
        }
        return orderedVehicles;
    }

    public ArrayList<Vehicle> sortPrice(ArrayList<Vehicle> myList, String order) {
        ArrayList<Double> price = new ArrayList<>();

        for (Vehicle v : myList) {
            price.add(v.getPrice());
        }

        if (order == "Lowest") {
            Collections.sort(price);
        } else if (order == "Highest") {
            Collections.sort(price, Collections.reverseOrder());
        } else {
            throw new IllegalArgumentException("No filter chosen");
        }

        for (double d : price) {
            for (Vehicle v : myList) {
                if (d == v.getPrice()) {
                    orderedVehicles.add(v);
                }
            }
        }
        return orderedVehicles;
    }
}