package org.fasttrackit;

public class Rescuer {


    String name;

    int availableMoney;

    public Rescuer(String name) {
        this.name = name;
    }

    public Rescuer(int availableMoney) {
        this.availableMoney = availableMoney;

    }

    public void feedAnimal (Animal animal, Food food, Rescuer rescuer) {
        System.out.println(rescuer.name + "gave some:" + food.name + "to:" + animal.name);


    }

    }





