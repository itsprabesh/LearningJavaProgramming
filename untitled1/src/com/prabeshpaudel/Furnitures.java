package com.prabeshpaudel;

public class Furnitures {
    private String name;
    private int price;
    private Dimensions dimensions;

    public Furnitures(String name, int price, Dimensions dimensions) {
        this.name = name;
        this.price = price;
        this.dimensions = dimensions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }
}
