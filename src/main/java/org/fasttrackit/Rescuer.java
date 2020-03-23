package org.fasttrackit;

public class Rescuer {


    private String name;

    private int availableMoney;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAvailableMoney() {
        return availableMoney;
    }

    public void setAvailableMoney(int availableMoney) {
        this.availableMoney = availableMoney;
    }

    @Override
    public String toString() {
        return "Rescuer{" +
                "name='" + name + '\'' +
                ", availableMoney=" + availableMoney +
                '}';
    }

    public Rescuer(String name, int availableMoney) {
        this.name = name;
        this.availableMoney = availableMoney;
    }



    public void feedAnimal (Animal animal, Food food) {

        if (animal.favoriteFood == food.name) {
            animal.mood= 1;
            System.out.println("return 1");

        }


        System.out.println(name + " just gave some " + food.name + " to " + animal.name);

        System.out.println(animal.name + " was fed!");


    }

    public void playingWithAnimal (Animal animal, Activity activity){

        System.out.println(name + " is now " + activity.name + " with " + animal.name);
    }




    }






