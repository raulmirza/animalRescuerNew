package org.fasttrackit;


import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {

        Activity activity = new Activity();

        activity.name = "Playing catch";


        Animal animal = new Animal();

        animal.hungerLevel = 1;
        animal.mood = 1;
        animal.age = 7;
        animal.name = "Spike";
        animal.favoriteActivity = "Playing catch";
        animal.healtLevel = 1;
        animal.favoriteFood = "Purina";


        Food food = new Food();

        food.expirationDate = LocalDate.of(2020, 11, 10);
        food.quantity = 1;
        food.price = 2;
        food.name = "Food's";
        food.stock = 5;

        Veterinary veterinary = new Veterinary();

        veterinary.name = "Alex";
        veterinary.profession = "Veterinary Doctor";


        Rescuer rescuer = new Rescuer();

        rescuer.availableMoney = 2;
        rescuer.name = "Adam";


        Dog dog = new Dog();

        dog.colour = "Brown";


        Pets pets = new Pets();

        pets.category = "Dog";





        }

        }


