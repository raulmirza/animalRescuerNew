package org.fasttrackit;

import java.time.LocalDate;

public class Food {

    String name;
    double price;
    int quantity;
    LocalDate expirationDate;
    int stock;

    public Food(String name) {
        this.name = name;
    }

    public Food(double price) {
        this.price = price;
    }


    public Food(int quantity) {
        this.quantity = quantity;
    }
}



