/*
Software Engineering with Test
Delivery Pipeline Project

Author:  Gearoid Hawkins
Email: G00308088@gmit.ie
Date:  07/05/2020

Description:
    Bike class that that inherits from the vehicle class.
 */
package ie.gmit;

public class Bike extends Vehicle {

    private boolean hasTransportBox;
    private boolean hasPassengerSeat;

    private int topSpeed;

    // Constructors **************************************************************************************************************
    public Bike(String manufacturer, String yearOfReg, int engineSize, String colour, int mileage, double price, boolean hasTransportBox, boolean hasPassengerSeat, int topSpeed) {
        super(manufacturer, yearOfReg, engineSize, colour, mileage, price);
        setHasTransportBox(hasTransportBox);
        setHasPassengerSeat(hasPassengerSeat);
        setTopSpeed(topSpeed);
    }

    public Bike(boolean hasTransportBox, boolean hasPassengerSeat, int topSpeed) {
        setHasTransportBox(hasTransportBox);
        setHasPassengerSeat(hasPassengerSeat);
        setTopSpeed(topSpeed);
    }

    //Getters & Setters **********************************************************************************************************
    public boolean isHasTransportBox() {
        return hasTransportBox;
    }

    public void setHasTransportBox(boolean hasTransportBox) {
        this.hasTransportBox = hasTransportBox;
    }

    public boolean isHasPassengerSeat() {
        return hasPassengerSeat;
    }

    public void setHasPassengerSeat(boolean hasPassengerSeat) {
        this.hasPassengerSeat = hasPassengerSeat;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        if(topSpeed >= 0) {
            this.topSpeed = topSpeed;
        }
        else
            throw new IllegalArgumentException("speed must be a positive number");
    }

    // Methods ***************************************************************************************************************
    public String generateReport()
    {
        String details = "\nManufacturer: " + getManufacturer() +
                "\nReg Plate: " + getRegPlate() +
                "\nEngine Size: " + getEngineSize() +
                "\nColour: " + getColour() +
                "\nMileage: " + getMileage() +
                "\nPrice: " + getPrice() +

                "\nTop Speed: " + topSpeed +
                "\nTransport Box: " + (hasTransportBox?"yes":"no") +
                "\nRPassengerSeat: " + (hasPassengerSeat?"yes":"no");
        return details;
    }

}
