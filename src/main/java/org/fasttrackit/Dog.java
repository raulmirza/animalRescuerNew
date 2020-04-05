package org.fasttrackit;

public class Dog extends Animal {

    private String colour;
    private int energyLevel;
    private boolean bite;

    public void showingHappinessState() {
        System.out.println("This dog is waving his tail");
    }


    public Dog(String name, String favoriteActivity, String favoriteFood) {
        super(favoriteActivity, favoriteFood, name);
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public boolean isBite() {
        return bite;
    }

    public void setBite(boolean bite) {
        this.bite = bite;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "colour='" + colour + '\'' +
                ", energyLevel=" + energyLevel +
                ", bite=" + bite +
                '}';
    }

    public void biteRescuer(Activity activity1,Boolean bite){
        if (bite.equals(true)){
        System.out.println(getName() + " is now " + activity1.getName());

    }else if(bite.equals(false)){
                System.out.println("This dog doesn't bite");
            }
        }

    }



