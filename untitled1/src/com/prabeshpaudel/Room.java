package com.prabeshpaudel;

public class Room {
    private Dimensions dimensions;
    private Furnitures furnitures;
    private String color;

    public Room(Dimensions dimensions, Furnitures furnitures, String color) {
        this.dimensions = dimensions;
        this.furnitures = furnitures;
        this.color = color;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public Furnitures getFurnitures() {
        return furnitures;
    }

    public String getColor() {
        return color;
    }

    public void getOut() {
        System.out.println("Getting out!");
        closeDoor();
    }

    private void closeDoor() {
        System.out.println("The door has been closed!");
    }
}
