package org.fasttrackit;

public class Animal {

    private int healthLevel;
    private String name;
    private int age;
    private int hungerLevel;
    private String favoriteActivity;
    private int mood;
    private String favoriteFood;

    public Animal(String name, String favoriteActivity, String favoriteFood) {
        this.name = name;
        this.favoriteActivity = favoriteActivity;
        this.favoriteFood = favoriteFood;
    }

    public Animal(String name, String favoriteFood) {
        this.name = name;
        this.favoriteFood = favoriteFood;
    }
    public void showingHappinessState() {
        System.out.println("This animal is waving his tail");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFavoriteActivity() {
        return favoriteActivity;
    }

    public void setFavoriteActivity(String favoriteActivity) {
        this.favoriteActivity = favoriteActivity;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "healthLevel=" + healthLevel +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", hungerLevel=" + hungerLevel +
                ", favoriteActivity='" + favoriteActivity + '\'' +
                ", mood=" + mood +
                ", favoriteFood='" + favoriteFood + '\'' +
                '}';
    }


}






















