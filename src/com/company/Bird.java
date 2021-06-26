package com.company;

public class Bird extends Animal{


    public Bird(String name, int weight, int numOfLegs, String fly, String eatingType) {
        super(name, weight, numOfLegs, fly, eatingType);
    }

    @Override
    public void move() {
        System.out.println("moving...");
    }


}
