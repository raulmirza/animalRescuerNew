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

    public void feedAnimal (Animal animal, Food food) {

        System.out.println(name + " just gave some " + food.name + " to " + animal.name);

        System.out.println(animal.name + " was fed!");


    }

    public void playingWithAnimal (Animal animal, Activity activity){

        System.out.println(name + " is now " + activity.name + " with " + animal.name);
    }




    }






