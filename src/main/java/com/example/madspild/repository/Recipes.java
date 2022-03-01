package com.example.madspild.repository;

import com.example.madspild.models.Recipe;

import java.util.ArrayList;
import java.util.List;

public class Recipes {

    private final ArrayList<Recipe> RECIPES = new ArrayList<>();

    public Recipes() {
        for (int i = 0; i < 100; i++) {
            RECIPES.add(new Recipe("name" + i, "This is a description of a recipe"));
        }

        RECIPES.get(0).addIngredient("butter", 400);
        RECIPES.get(0).addIngredient("sugar", 400);
        RECIPES.get(0).addIngredient("flour", 400);
        RECIPES.get(0).addIngredient("baking powder", 2);
    }

    public List<Recipe> getAllRecipes() {
        return RECIPES;
    }

    public Recipe getRecipe(String recipe) {
        for (Recipe r : RECIPES) {
            if (r.getName().equals(recipe)) {
                return r;
            }
        }
        return null;
    }
}
