package org.fasttrackit;

public class Pets extends Animal {

     private String category;

     public void showingHappinessState() {
         System.out.println("This pet is waving his tail");
     }

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
    public String toString() {
        return "Pets{" +
                "category='" + category + '\'' +
                '}';
    }
}

