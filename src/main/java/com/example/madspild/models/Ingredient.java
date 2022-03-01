package com.example.madspild.models;

public class Ingredient {
    String name;
    double amount;
    String type;

    public Ingredient(String name, double amount, String type) {
        this.name = name;
        this.amount = amount;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }
}
