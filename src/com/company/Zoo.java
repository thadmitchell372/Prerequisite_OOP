package com.company;

public class Zoo {

    public static void main(String[] args) {

        Animal lion = new Animal("Lion", 500, 4, "Does not fly.", "carnivore") {
            @Override
            public void move() {

            }
        };
        Animal pelican = new Animal("Pelican", 100, 2, "It does fly", "Carnivore") {
            @Override
            public void move() {

            }
        };
        Animal hippo = new Animal("Hippo", 2000, 4, "Does not fly", "Herbivore") {
            @Override
            public void move() {

            }
        };
//
//        Chicken chick1 = new Chicken("Thad",25,2,"Yes it does fly","Herbivore");
//        Sparrow sparrow1 = new Sparrow("Thad",20,2,"Yes","Carnivore");
//        //sparrow1.move();
//
//        Fish fish1 = new Fish("Fish",30,0,"no","carinvore");
//        //fish1.move();
//
//        moveAnimal(fish1);
//        moveAnimal(sparrow1);
//    }
//
//    public static void moveAnimal(Animal animal){
//        animal.move();
//    }
//

        Flyable flyingBird = new Sparrow("name",20,2,"Yes","carnivore");
        flyingBird.fly();
//        Flyable flyingBird2 = new Bird("name",20,2,"Yes","carnivore");
    }
}
