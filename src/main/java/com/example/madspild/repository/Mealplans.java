package com.example.madspild.repository;

import com.example.madspild.models.Mealplan;

import java.util.ArrayList;
import java.util.List;

public class Mealplans {
    private ArrayList<Mealplan> mealplans = new ArrayList<>();
    private Recipes recipes;

    // constructor - takes the Recipes to bind to the class
    public Mealplans(Recipes recipes) {
        this.recipes = recipes;

        for (int i = 0; i < 10; i++) {
            mealplans.add(new Mealplan("mealplan-" + i, i+1));
            mealplans.get(i).addRecipes(recipes.getRecipe(i));
            mealplans.get(i).addRecipes(recipes.getRecipe(i + 1));
            mealplans.get(i).addRecipes(recipes.getRecipe(i + 2));
        }
    }

    public void add(Mealplan mealplan) {
        mealplans.add(mealplan);
    }

    public List<Mealplan> getMealplans() {
        return mealplans;
    }

    // find a Mealplan from its name
    public Mealplan getMealplan(String name) {
        for (Mealplan mp : mealplans) {
            if (mp.getName().equals(name)) {
                return mp;
            }
        }
        return null;
    }
}
