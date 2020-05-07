package ie.gmit;

import java.util.ArrayList;

public class Finance {
    public double calculateTotal(ArrayList<Vehicle> myList){
        double total=0;
        for (Vehicle v: myList ) {
            double price= v.getPrice();
            total+=price;
        }
        return total;
    }
}