package com.company;

public class Fish extends Animal{


    public Fish(String name, int weight, int numOfLegs, String fly, String eatingType) {
        super(name, weight, numOfLegs, fly, eatingType);
    }

    @Override
    public void move() {
        System.out.println("pooping...");
    }

    public void swim(){
        System.out.println("Swimming...");
    }
}
