package com.company;

public abstract class Animal {

    String name;
    int weight;
    int numOfLegs;
    String fly;
    String eatingType;

    public Animal(String name, int weight, int numOfLegs, String fly, String eatingType) {
        this.name = name;
        this.weight = weight;
        this.numOfLegs = numOfLegs;
        this.fly = fly;
        this.eatingType = eatingType;
    }

    public void info(){
        System.out.println("This animal is a "+name);
        System.out.println("It weighs "+weight+" pounds");
        System.out.println("It has "+numOfLegs+" legs");
        System.out.println(fly);
        System.out.println("and it is a "+eatingType);
    }

    public void eat(){
        System.out.println("Eating...");
    }
    public void sleep(){
        System.out.println("Sleeping...");
    }

    public abstract void move();

}
