/*
Software Engineering with Test
Delivery Pipeline Project

Author:  Aaron McKinley
Email: G00299523@gmit.ie
Date:  07/05/2020

Description:
    Finance class to be used with the base classes.
 */
package ie.gmit;

import java.util.ArrayList;

public class Finance {

    public double calculateTotal(ArrayList<Vehicle> myList){
        if(myList.isEmpty()) {
            throw new IllegalArgumentException("No vehicles in the list");
        }
        else {
            double total = 0;
            for (Vehicle v : myList) {
                double price = v.getPrice();
                total += price;
            }
            double rounded = Math.round(total * 100.0) / 100.0;
            return rounded;
        }
    }
    public double calculateVAT(ArrayList<Vehicle> myList){
        if(myList.isEmpty()) {
            throw new IllegalArgumentException("No vehicles in the list");
        }
        else {
            double total = calculateTotal(myList);
            double VAT = 0;
            VAT = (total / 100) * 23;
            double rounded = Math.round(VAT * 100.0) / 100.0;
            return rounded;
        }
    }
    public double monthlyPayments(ArrayList<Vehicle> myList, int years, int rate){
        if(myList.isEmpty()) {
            throw new IllegalArgumentException("No vehicles in the list");
        }
        else {
            double totalNoVAT = calculateTotal(myList);
            double VAT = calculateVAT(myList);
            double monthly;
            double total = totalNoVAT + VAT;
            double rounded=0;
            if(rate <= 10) {
                total += (total / 100) * rate;
            }
            else{
                throw new IllegalArgumentException("Interest Rate is too high as its >10%");
            }
            if(years <= 5) {
                monthly = (total / years) / 12;
                rounded = Math.round(monthly * 100.0) / 100.0;
            }
            else{
                throw new IllegalArgumentException("Loan length is too long >5 years");
            }
            return rounded;
        }
    }
}