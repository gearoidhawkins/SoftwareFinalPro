package ie.gmit;

import java.util.ArrayList;

public class Truck extends Vehicle {

    private String licenceTypeRequired; // B, C1 or C
    private int numberOfSeats;
    private String Type; // flatbed, low loader, refrigerated

    // Constructors **************************************************************************************************************
    public Truck(String manufacturer, String regPlate, int engineSize, String colour, int mileage, double price, String licenceTypeRequired, int numberOfSeats, String type) {
        super(manufacturer, regPlate, engineSize, colour, mileage, price);
        this.licenceTypeRequired = licenceTypeRequired;
        this.numberOfSeats = numberOfSeats;
        Type = type;
    }

    public Truck(String licenceTypeRequired, int numberOfSeats, String type) {
        setLicenceTypeRequired(licenceTypeRequired);
        setNumberOfSeats(numberOfSeats);
        setType(type);
    }

    //Getters & Setters **********************************************************************************************************
    public String getLicenceTypeRequired() {
        return licenceTypeRequired;
    }

    public void setLicenceTypeRequired(String licenceTypeRequired) {
        if(licenceTypeRequired.equalsIgnoreCase("b") || licenceTypeRequired.equalsIgnoreCase("c1") || licenceTypeRequired.equalsIgnoreCase("c") ) {
            this.licenceTypeRequired = licenceTypeRequired;
        }
        else
            throw new IllegalArgumentException("not a valid licence type");
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        if(( numberOfSeats > 0)  && numberOfSeats < 4)
            this.numberOfSeats = numberOfSeats;
        else
            throw new IllegalArgumentException("not the correct amount of seats");
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        if(type.equalsIgnoreCase("Flatbed") || type.equalsIgnoreCase("low loader") || type.equalsIgnoreCase("refrigerated") ) {
            Type = type;
        }
        else
            throw new IllegalArgumentException("not a valid truck type");
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

                "\nLicence: " + licenceTypeRequired +
                "\nSeats: " + numberOfSeats +
                "\nType: " + Type;
        return details;
    }
}
