package com.company;

public class Sparrow extends Bird implements Flyable{

    public Sparrow(String name, int weight, int numOfLegs, String fly, String eatingType) {
        super(name, weight, numOfLegs, fly, eatingType);
    }


    @Override
    public void fly() {
        System.out.println("Sparrow flying high.");
    }
}
