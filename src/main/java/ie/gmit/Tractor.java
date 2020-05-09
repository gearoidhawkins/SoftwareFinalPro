/*
Software Engineering with Test
Delivery Pipeline Project

Author:  Gearoid Hawkins
Email: G00308088@gmit.ie
Date:  07/05/2020

Description:
    Tractor class that that inherits from the vehicle class.
 */
package ie.gmit;

public class Tractor extends Vehicle{

    private int horsePower;
    private int numberOfSpoolValves;
    private boolean is4WD;
    private String otherAttachments;

    // Constructors **************************************************************************************************************
    public Tractor(int horsePower, int numberOfSpoolValves, boolean is4WD, String otherAttachments) {
        setHorsePower(horsePower);
        setNumberOfSpoolValves(numberOfSpoolValves);
        setIs4WD(is4WD);
        setOtherAttachments(otherAttachments);
    }

    //Getters & Setters **********************************************************************************************************
    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        if(horsePower > 30) {
            this.horsePower = horsePower;
        }
        else
            throw new IllegalArgumentException("horse power too low");
    }

    public int getNumberOfSpoolValves() {
        return numberOfSpoolValves;
    }

    public void setNumberOfSpoolValves(int numberOfSpoolValves) {
        if( (numberOfSpoolValves < 1) || (numberOfSpoolValves > 4) ) {
            throw new IllegalArgumentException("not a valid spool valve number");
        }
        else
            this.numberOfSpoolValves = numberOfSpoolValves;
    }

    public boolean isIs4WD() {
        return is4WD;
    }

    public void setIs4WD(boolean is4WD) {
        this.is4WD = is4WD;
    }

    public String getOtherAttachments() {
        return otherAttachments;
    }

    public void setOtherAttachments(String otherAttachments) {
        if(otherAttachments.equalsIgnoreCase("Loader") || otherAttachments.equalsIgnoreCase("Front Linkage"))
            this.otherAttachments = otherAttachments;
        else
            throw new IllegalArgumentException("not a valid attachment");
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

                "\nHorsePower: " + horsePower +
                "\nSpools: " + numberOfSpoolValves +
                "\n4WD: " + (is4WD?"yes":"no") +
                "\nAttachments: " + otherAttachments;
        return details;
    }
}
