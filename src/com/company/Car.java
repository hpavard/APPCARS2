/**
 * In this part, we can find the code for adding,
 * setting and removing the cars who can be rented
 * by the users of the application.
 */

package com.company;

public class Car {

    /**
     * Car informations :
     */
    private String brand;
    private String model;
    private int yearOfRelease;
    private String reference;

    public Car(String b, String m, int y, String r) {
        brand = b;
        model = m;
        yearOfRelease = y;
        reference = r;
    }

    /**
     * Get car informations :
     */
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getYearOfRelease() {
        return yearOfRelease;
    }
    public String getReference() {
        return reference;
    }

    /**
     * Add a car :
     */
    public void setBrand(String b) {
        brand = b;
    }
    public void setModel(String m) {
        model = m;
    }
    public void setYearOfRelease(int y) {
        yearOfRelease = y;
    }
    public void setReference(String r) {
        reference = r;
    }
}
