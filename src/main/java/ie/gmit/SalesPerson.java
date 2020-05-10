/*
Software Engineering with Test
Delivery Pipeline Project

Author:  Gearoid Hawkins
Email: G00308088@gmit.ie
Date:  08/05/2020

Description:
    SalesPerson class for employees of the dealership.
 */
package ie.gmit;

public class SalesPerson {

    private String firstName;
    private String lastName;
    private String ID;
    private String email;
    private boolean hasAdminRights;

    // Constructors *********************************************************************************

    public SalesPerson(String firstName, String lastName, String ID, String email, boolean hasAdminRights) {
        setFirstName(firstName);
        setLastName(lastName);
        setID(ID);
        setEmail(email);
        setHasAdminRights(hasAdminRights);
    }

    // Getters & Setters *********************************************************************************
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName.length() > 1)
            this.firstName = firstName;
        else
            throw new IllegalArgumentException("First Name must be longer than 1 character");
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName.length() > 1)
            this.lastName = lastName;
        else
            throw new IllegalArgumentException("Last Name must be longer than 1 character");
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        if(ID.length() == 5)
            this.ID = ID;
        else
            throw new IllegalArgumentException("ID number must be 5 digits long");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email.toLowerCase().contains("@walshmotors.com"))
            this.email = email;
        else
            throw new IllegalArgumentException("Invalid email: must be @WalshMotors.com");
    }

    public boolean isHasAdminRights() {
        return hasAdminRights;
    }

    public void setHasAdminRights(boolean hasAdminRights) {
        this.hasAdminRights = hasAdminRights;
    }

}
