package com.prabeshpaudel;

public class Main {
    public static void main(String[] args) {
        Furnitures sofa = new Furnitures("sofa" , 200, new Dimensions(2,2,2));
        Furnitures bed = new Furnitures("bed", 300, new Dimensions(3,3,3));
        Furnitures table = new Furnitures("Dining table", 150, new Dimensions(2,3,4));

        Room living = new Room(new Dimensions(13,13,13), sofa, "green");
        Room kitchen = new Room(new Dimensions(15,15,14), table, "blue");
        Room bedroom = new Room(new Dimensions(12,13,14), bed, "red");

        House myHouse = new House(kitchen, bedroom, living);

        System.out.println(myHouse.getBedroom().getFurnitures().getDimensions().getHeight());
        myHouse.getLivingRoom().getFurnitures().getDimensions().printDimensions();
        myHouse.getLivingRoom().getOut();
    }
}
