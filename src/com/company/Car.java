package com.company;

public class Car {
    private String ID;
    private String numberOfAuto;

    public Car(String ID, String numberOfAuto) {
        this.ID = ID;
        this.numberOfAuto = numberOfAuto;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNumberOfAuto() {
        return numberOfAuto;
    }

    public void setNumberOfAuto(String numberOfAuto) {
        this.numberOfAuto = numberOfAuto;
    }

    @Override
    public String toString() {
        return
                "\nID: " + ID +
                "\nномер авто: " + numberOfAuto;
    }
}
