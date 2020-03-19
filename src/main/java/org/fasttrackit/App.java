package org.fasttrackit;


import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {

        Activity activity = new Activity("Playing catch");

        activity.name = "Playing catch";


        Animal animal = new Animal("Spike");

        animal.hungerLevel = 1;
        animal.mood = 1;
        animal.age = 7;
        animal.name = "Spike";
        animal.favoriteActivity = "Playing catch";
        animal.healtLevel = 1;
        animal.favoriteFood = "Purina";


        Food food = new Food("Purina");

        food.expirationDate = LocalDate.of(2020, 11, 10);
        food.quantity = 1;
        food.price = 2;
        food.name = "Food";
        food.stock = 5;

        Veterinary veterinary = new Veterinary("Alex");

        veterinary.name = "Alex";
        veterinary.profession = "Veterinary Doctor";


        Rescuer rescuer = new Rescuer("Adam");

        rescuer.feedAnimal(animal, food, rescuer);

        rescuer.playingWithAnimal(animal, activity, rescuer);

        rescuer.availableMoney = 2;
        rescuer.name = "Adam";


        Dog dog = new Dog("Spike");

        dog.colour = "Brown";
        dog.bite = false;
        dog.energyLevel = 10;



        Pets pets = new Pets("Spike");

        pets.category = "Dog";




        }

    }


