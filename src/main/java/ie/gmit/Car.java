/*
Software Engineering with Test
Delivery Pipeline Project

Author:  Gearoid Hawkins
Email: G00308088@gmit.ie
Date:  07/05/2020

Description:
    Car class that that inherits from the vehicle class.
 */
package ie.gmit;

public class Car extends Vehicle {

    private boolean rightHandDrive;
    private int numberOfDoors;
    private String bodyType; // Saloon, Hatchback, Estate

    // Constructors **************************************************************************************************************

    public Car(String manufacturer, String yearOfReg, int engineSize, String colour, int mileage, double price, boolean rightHandDrive, int numberOfDoors, String bodyType) {
        super(manufacturer, yearOfReg, engineSize, colour, mileage, price);
        setRightHandDrive(rightHandDrive);
        setNumberOfDoors(numberOfDoors);
        setBodyType(bodyType);
    }

    public Car(boolean rightHandDrive, int numberOfDoors, String bodyType) {
        setRightHandDrive(rightHandDrive);
        setNumberOfDoors(numberOfDoors);
        setBodyType(bodyType);
    }

    //Getters & Setters **********************************************************************************************************
    public boolean isRightHandDrive() {
        return rightHandDrive;
    }

    public void setRightHandDrive(boolean rightHandDrive) {
        this.rightHandDrive = rightHandDrive;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        if(numberOfDoors <= 5) {
            this.numberOfDoors = numberOfDoors;
        }
        else
            throw new IllegalArgumentException("Too many doors");
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        if( bodyType.equalsIgnoreCase("Saloon") || bodyType.equalsIgnoreCase("Hatchback") || bodyType.equalsIgnoreCase("Estate") ) {
            this.bodyType = bodyType;
        }
        else
            throw new IllegalArgumentException("Not a valid body type");
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

                "\nDoors: " + numberOfDoors +
                "\nBody type: " + bodyType +
                "\nRight Hand drive: " + (rightHandDrive?"yes":"no");
        return details;
    }
}
