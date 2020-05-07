package ie.gmit;

import java.util.ArrayList;

public class Truck {

    private String licenceTypeRequired; // B, C1 or C
    private int numberOfSeats;
    private String Type; // flatbed, low loader, refrigerated

    // Constructors **************************************************************************************************************
    public Truck(String licenceTypeRequired, int numberOfSeats, String type) {
        this.licenceTypeRequired = licenceTypeRequired;
        this.numberOfSeats = numberOfSeats;
        Type = type;
    }

    //Getters & Setters **********************************************************************************************************
    public String getLicenceTypeRequired() {
        return licenceTypeRequired;
    }

    public void setLicenceTypeRequired(String licenceTypeRequired) {
        this.licenceTypeRequired = licenceTypeRequired;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }
}
