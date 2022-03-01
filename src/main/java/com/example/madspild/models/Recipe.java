package com.example.madspild.models;

import java.util.HashMap;

public class Recipe {
    private String name;
    private String description;
    private HashMap<String,Double> ingredients = new HashMap<>();

    public Recipe(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void addIngredient(String ingredient, double amount) {
        ingredients.put(ingredient, amount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public HashMap<String, Double> getIngredients() {
        return ingredients;
    }

    public void setIngredients(HashMap<String, Double> ingredients) {
        this.ingredients = ingredients;
    }
}
