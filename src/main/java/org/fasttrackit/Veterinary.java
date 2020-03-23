package org.fasttrackit;

public class Veterinary {

    private String name;
    private String profession;

    public Veterinary(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Veterinary{" +
                "name='" + name + '\'' +
                ", profession='" + profession + '\'' +
                '}';
    }
}
