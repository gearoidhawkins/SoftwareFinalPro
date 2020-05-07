package ie.gmit;

public class testClass {

    private String name;
    private int ID;


    public testClass(String name, int ID) {
        setName(name);
        setID(ID);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() < 5)
        {
            throw new IllegalArgumentException("Invalid name length");
        }
        else
        {
            this.name = name;
        }
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        if( (ID < 10000) || (ID > 99999)) // if not a 5 digit number
        {
            throw new IllegalArgumentException("Employee Number should be 5 digits");
        }
        else
        {
            this.ID = ID;
        }
    }
}
