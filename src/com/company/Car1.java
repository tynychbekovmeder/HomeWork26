package com.company;

public class Car1 {
    private int made;
    private String model;
    private String price;
    private String color;

    public Car1(int made, String model, String price, String color) {
        this.made = made;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public int getMade() {
        return made;
    }

    public void setMade(int made) {
        this.made = made;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return
                "\nГод вывуска: " + made +
                "\nМодель: " + model +
                "\nЦена авто: " + price +
                "\nЦвет машины: " + color;
    }
}
