package org.fasttrackit;

public class Pets extends Animal {

     private String category;

    public Pets(String name, String favoriteActivity, String favoriteFood) {
        super(favoriteActivity, favoriteFood, favoriteActivity);

    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getFavoriteActivity() {
        return super.getFavoriteActivity();
    }

    @Override
    public void setFavoriteActivity(String favoriteActivity) {
        super.setFavoriteActivity(favoriteActivity);
    }

    @Override
    public String getFavoriteFood() {
        return super.getFavoriteFood();
    }

    @Override
    public void setFavoriteFood(String favoriteFood) {
        super.setFavoriteFood(favoriteFood);
    }

    @Override
    public int getHungerLevel() {
        return super.getHungerLevel();
    }

    @Override
    public void setHungerLevel(int hungerLevel) {
        super.setHungerLevel(hungerLevel);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public int getMood() {
        return super.getMood();
    }

    @Override
    public void setMood(int mood) {
        super.setMood(mood);
    }

    @Override
    public int getHealthLevel() {
        return super.getHealthLevel();
    }

    @Override
    public void setHealthLevel(int healthLevel) {
        super.setHealthLevel(healthLevel);
    }

    @Override
    public String toString() {
        return "Pets{" +
                "category='" + category + '\'' +
                '}';
    }
}
