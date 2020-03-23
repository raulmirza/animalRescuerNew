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

        if (animal.getFavoriteFood()== food.getName()) {
           animal.setMood(animal.getMood()+1);
            System.out.println(animal.getMood() );

        }


        System.out.println(name + " just gave some " + food.getName() + " to " + animal.getName());

        System.out.println(animal.getName() + " was fed!");


    }

    public void playingWithAnimal (Animal animal, Activity activity){

        System.out.println(name + " is now " + activity.getName() + " with " + animal.getName());
        if (animal.getFavoriteActivity() == activity.getName()){
            animal.setMood(animal.getMood()+1);
            System.out.println(animal.getMood());
        }


    }




    }






