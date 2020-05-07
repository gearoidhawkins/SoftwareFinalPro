package ie.gmit;

import java.util.ArrayList;

public class Finance {
    public double calculateTotal(ArrayList<Vehicle> myList){
        double total=0;

        for (Vehicle v: myList ) {
            double price= v.getPrice();
            total+=price;
        }
        double rounded = Math.round(total * 100.0) / 100.0;
        return rounded;
    }
    public double calculateVAT(ArrayList<Vehicle> myList){
        double total = calculateTotal(myList);
        double VAT = 0;
        VAT = (total/100)*23;
        double rounded = Math.round(VAT * 100.0) / 100.0;
        return rounded;
    }
    public double monthlyPayments(ArrayList<Vehicle> myList, int years, int rate){
        double total = calculateTotal(myList);
        double monthly;
        total+=(total/100)*rate;
        monthly = (total/years)/12;
        double rounded = Math.round(monthly * 100.0) / 100.0;
        return rounded;
    }
}