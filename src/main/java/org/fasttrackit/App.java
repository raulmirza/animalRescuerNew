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

        Activity activity1 = new Activity("biting rescuer");
        activity1.setName("Biting rescuer");


        System.out.println("Activity name: " + activity.getName());
        Animal animal = new Animal("Playing catch", "Purina");

        animal.setName("Spike");
       animal.setHealthLevel(1);
       animal.setFavoriteFood("Purina");
       animal.setAge(7);
       animal.setMood(5);
       animal.setFavoriteActivity("Playing catch");
       animal.setHungerLevel(5);

       animal.showingHappinessState();

        System.out.println("Animal name: "+ animal.getName());
        System.out.println("Health level: " + animal.getHealthLevel());
        System.out.println("Hunger level: " + animal.getHungerLevel());
        System.out.println("Favorite activity " + animal.getFavoriteActivity());
        System.out.println("Animal has now the mood: " + animal.getMood());
        System.out.println("Your animal age is: " + animal.getAge());
        System.out.println("This animal favorite food is: " + animal.getFavoriteFood());


       Food food = new Food("Purina");

        food.setExpirationDate(LocalDate.of(2020,11,10));
        food.setQuantity(1);
        food.setPrice(2);
        food.setStock(5);
        food.setName("Purina");

        System.out.println("Expiration date :" + food.getExpirationDate());
        System.out.println("Quantity: " + food.getQuantity());
        System.out.println("Price " + food.getPrice());
        System.out.println("Stock " + food.getStock());
        System.out.println("Name " + food.getName());


        Veterinary veterinary = new Veterinary("Alex");


        veterinary.setName("Alex");
        veterinary.setProfession("Veterinary Doctor");

        System.out.println("Hei! My name is: " +veterinary.getName());
        System.out.println("My profession is: " + veterinary.getProfession());



        Rescuer rescuer = new Rescuer("Adam", 2);

        rescuer.feedAnimal(animal, food);

        rescuer.playingWithAnimal(animal, activity);

        rescuer.setAvailableMoney(2);
        rescuer.setName("Adam");

        System.out.println("My name is: " + rescuer.getName());
        System.out.println("My budget is: " + rescuer.getAvailableMoney());



        Dog dog = new Dog("Spike", "Playing catch", "Purina");


        dog.biteRescuer(activity1,false);
        dog.showingHappinessState();


        dog.setName("Bullet");
        dog.setColour("Brown");
        dog.setBite(false);
        dog.setEnergyLevel(10);
        dog.setFavoriteFood("Purina");
        dog.setHungerLevel(8);
        dog.setFavoriteActivity("Playing catch");
        dog.setMood(8);
        dog.setHealthLevel(7);
        animal.setAge(2);

        System.out.println("This animal name is: " + dog.getName());
        System.out.println("His favorite activity is: " + dog.getFavoriteActivity());
        System.out.println("His favorite food is: " + dog.getFavoriteFood());
        System.out.println("This dog has an energy level of: "  + dog.getEnergyLevel());
        System.out.println("Hunger level is: " + dog.getHungerLevel());
        System.out.println("His health level is: " + dog.getHealthLevel());
        System.out.println("Colour of the dog is: " + dog.getColour());
        System.out.println("This animal mood: " + dog.getMood());
        System.out.println("This animal has: " + dog.getAge() + " years");
        System.out.println("Is this dog biting?: " + dog.isBite());




        Pets pets = new Pets("Pets","Playing catch", "Purina");

        pets.showingHappinessState();

        pets.setCategory("Dog");
        pets.setFavoriteFood("Purina");
        pets.setAge(2);
        pets.setFavoriteActivity("Running");
        pets.setHealthLevel(2);
        pets.setHungerLevel(9);
        pets.setMood(4);
        pets.setName("Spike");


        System.out.println("This animal is a:" + pets.getCategory());
        System.out.println("This pet name is: " + pets.getName());
        System.out.println("He has:" +  pets.getAge() + " years");
        System.out.println("Health level is:" + pets.getHealthLevel());
        System.out.println("Hunger level is:" + pets.getHungerLevel());
        System.out.println("Favorite activity is:" + pets.getFavoriteActivity());
        System.out.println("Mood is:" + pets.getMood());
        System.out.println("Favorite food is:" + pets.getFavoriteFood());




        }


    }


