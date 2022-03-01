package com.example.madspild.models;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private String name;
    private String description;
    private ArrayList<Ingredient> ingredients = new ArrayList<>();

    public Recipe(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
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

    public List<Ingredient> getIngredients() {
        return ingredients;
    }
}
