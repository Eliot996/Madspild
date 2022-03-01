package com.example.madspild.repository;

import com.example.madspild.models.Recipe;

import java.util.ArrayList;
import java.util.List;

public class Recipes {

    private ArrayList<Recipe> recipes = new ArrayList<>();

    public Recipes() {
        for (int i = 0; i < 100; i++) {
            recipes.add(new Recipe("name" + i, "This is a description of a recipe"));
        }

        recipes.get(0).addIngredient("butter", 400);
        recipes.get(0).addIngredient("sugar", 400);
        recipes.get(0).addIngredient("flour", 400);
        recipes.get(0).addIngredient("baking powder", 2);
    }

    public List<Recipe> getAllRecipes() {
        return recipes;
    }
}
