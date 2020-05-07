package ie.gmit;

public class Bike extends vehicle {

    private boolean hasTransportBox;
    private boolean hasPassengerSeat;

    private int topSpeed;


    // Constructors **************************************************************************************************************
    public Bike(String manufacturer, String yearOfReg, int engineSize, String colour, int mileage, int price, boolean hasTransportBox, boolean hasPassengerSeat, int topSpeed) {
        super(manufacturer, yearOfReg, engineSize, colour, mileage, price);
        this.hasTransportBox = hasTransportBox;
        this.hasPassengerSeat = hasPassengerSeat;
        this.topSpeed = topSpeed;
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
        this.topSpeed = topSpeed;
    }
}
