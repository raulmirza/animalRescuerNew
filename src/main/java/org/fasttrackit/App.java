package org.fasttrackit;


import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {

        Activity activity = new Activity("Playing catch");


        activity.setName("Playing catch");



        Animal animal = new Animal("Playing catch", "Purina");

       animal.setHealthLevel(1);
       animal.setFavoriteFood("Purina");
       animal.setAge(7);
       animal.setMood(5);
       animal.setName("Spike");
       animal.setFavoriteActivity("Playing catch");
       animal.setHungerLevel(5);




        Food food = new Food("Purina");

        food.setExpirationDate(LocalDate.of(2020,11,10));
        food.setQuantity(1);
        food.setPrice(2);
        food.setStock(5);
        food.setName("Purina");



        Veterinary veterinary = new Veterinary("Alex");


        veterinary.setName("Alex");
        veterinary.setProfession("Veterinary Doctor");


        Rescuer rescuer = new Rescuer("Adam", 2);

        rescuer.feedAnimal(animal, food);

        rescuer.playingWithAnimal(animal, activity);


        rescuer.setAvailableMoney(2);
        rescuer.setName("Adam");


        Dog dog = new Dog("Spike", "Playing catch", "Purina");


        dog.setColour("Brown");
        dog.setBite(false);
        dog.setEnergyLevel(10);
        dog.setFavoriteFood("Purina");
        dog.setName("Bullet");
        dog.setHungerLevel(8);
        dog.setFavoriteActivity("Playing catch");
        dog.setMood(8);
        dog.setHealthLevel(7);
        animal.setAge(2);




        Pets pets = new Pets("Pets","Playing catch", "Purina");


        pets.setCategory("Dog");
        pets.setFavoriteFood("Purina");
        pets.setAge(2);
        pets.setFavoriteActivity("Running");
        pets.setHealthLevel(2);
        pets.setHungerLevel(9);
        pets.setMood(4);
        pets.setName("Spike");




        }


    }


