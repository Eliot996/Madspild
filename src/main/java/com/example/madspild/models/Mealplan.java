package com.example.madspild.models;

import java.util.ArrayList;
import java.util.HashMap;

public class Mealplan {
   private String name;
   private int amountOfPortions;
   private ArrayList<Recipe> recipes = new ArrayList<>();

    public Mealplan(String name, int amountOfPortions, ArrayList<Recipe> recipes) {
        this.name = name;
        this.amountOfPortions = amountOfPortions;
        this.recipes = recipes;
    }

    public Mealplan(String name, int amountOfPortions) {
        this.name = name;
        this.amountOfPortions = amountOfPortions;
    }

    public Mealplan() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountOfPortions() {
        return amountOfPortions;
    }

    public void setAmountOfPortions(int amountOfPortions) {
        this.amountOfPortions = amountOfPortions;
    }

    public ArrayList<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(ArrayList<Recipe> recipes) {
        this.recipes = recipes;
    }

}
