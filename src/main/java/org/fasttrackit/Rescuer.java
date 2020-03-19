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

        System.out.println(rescuer.name + " just gave some " + food.name + " to " + animal.name);

        System.out.println(animal.name + " was fed!");


    }

    public void playingWithAnimal (Animal animal, Activity activity, Rescuer rescuer){

        System.out.println(rescuer.name + " is now " + activity.name + " with " + animal.name);
    }

    }





