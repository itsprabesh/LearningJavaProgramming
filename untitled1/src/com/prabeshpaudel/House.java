package com.prabeshpaudel;

public class House {
    private Room kitchen;
    private Room bedroom;
    private Room livingRoom;

    public House(Room kitchen, Room bedroom, Room livingRoom) {
        this.kitchen = kitchen;
        this.bedroom = bedroom;
        this.livingRoom = livingRoom;
    }

    public Room getKitchen() {
        return kitchen;
    }

    public Room getBedroom() {
        return bedroom;
    }

    public Room getLivingRoom() {
        return livingRoom;
    }
}
