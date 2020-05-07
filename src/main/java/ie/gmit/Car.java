package ie.gmit;

public class Car extends vehicle {

    private boolean rightHandDrive;
    private int numberOfDoors;
    private String bodyType; // Saloon, Hatchback, Estate

    // Constructors **************************************************************************************************************

    public Car(String manufacturer, String yearOfReg, int engineSize, String colour, int mileage, int price, boolean rightHandDrive, int numberOfDoors, String bodyType) {
        super(manufacturer, yearOfReg, engineSize, colour, mileage, price);
        this.rightHandDrive = rightHandDrive;
        this.numberOfDoors = numberOfDoors;
        this.bodyType = bodyType;
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
        this.numberOfDoors = numberOfDoors;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }
}
