package com.example.madspild.services;

import com.example.madspild.models.Ingredient;
import com.example.madspild.models.Mealplan;
import com.example.madspild.models.Recipe;

import java.util.ArrayList;
import java.util.List;

public class MealplanService {

    private ArrayList<Ingredient> ingredientsArrayList = new ArrayList<>();

    // creates the shopping list to a mealplan
    public List<Ingredient> getShoppinglist(Mealplan mealplan) {
        for (Recipe recipe : mealplan.getRecipes()) {
            for (Ingredient ingredient : recipe.getIngredients()) {
                    addOrCreateIngredientForList(ingredient);
                }
            }

        ArrayList<Ingredient> returnValue = ingredientsArrayList;
        ingredientsArrayList = new ArrayList<>();
        return returnValue;
    }

    // checks if the Ingredient is in the list, and if it is not in the list, adds it to the list,
    // else adds the amount to the existing one
    private void addOrCreateIngredientForList(Ingredient in) {
        boolean foundInList = false;
        int index = 0;

        for (Ingredient inList: ingredientsArrayList) {
            if (inList.getName().equals(in.getName())) {
                foundInList = true;
                index = ingredientsArrayList.indexOf(inList);
                break;
            }
        }

        if (foundInList) {
            ingredientsArrayList.get(index).setAmount(ingredientsArrayList.get(index).getAmount() + in.getAmount());
        } else {
            ingredientsArrayList.add(new Ingredient(in.getName(), in.getAmount(), in.getType()));
        }

    }
}
