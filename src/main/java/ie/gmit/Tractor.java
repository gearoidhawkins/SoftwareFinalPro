package ie.gmit;

public class Tractor {

    private int horsePower;
    private int numberOfSpoolValves;
    private boolean is4WD;
    private String otherAttachments;

    // Constructors **************************************************************************************************************
    public Tractor(int horsePower, int numberOfSpoolValves, boolean is4WD, String otherAttachments) {
        this.horsePower = horsePower;
        this.numberOfSpoolValves = numberOfSpoolValves;
        this.is4WD = is4WD;
        this.otherAttachments = otherAttachments;
    }

    //Getters & Setters **********************************************************************************************************
    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getNumberOfSpoolValves() {
        return numberOfSpoolValves;
    }

    public void setNumberOfSpoolValves(int numberOfSpoolValves) {
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
        this.otherAttachments = otherAttachments;
    }
}
