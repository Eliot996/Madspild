package com.example.madspild.repository;

import com.example.madspild.models.Ingredient;
import com.example.madspild.models.Recipe;

import java.util.ArrayList;
import java.util.List;

public class Recipes {

    private final ArrayList<Recipe> RECIPES = new ArrayList<>();

    public Recipes() {
        for (int i = 0; i < 100; i++) {
            RECIPES.add(new Recipe("name" + i, "<h3>Pandekagedej:</h3>\n" +
                    "Æg og mel piskes sammen. Heri piskes det varme smeltede smør, spæd med mælk og smages til med salt, sukker og vanille.\n" +
                    "\n" +
                    "Bag pandekagerne lysebrune i smør på panden. Der bliver 8-12 pandekager alt efter pandens størrelse. 12 stk. med pande på 19 cm. i diameter.\n" +
                    "\n" +
                    "Server pandekagerne med, sukker og syltetøj, blød vanilleis eller flødeskum.\n" +
                    "\n" +
                    "<h3>Tips:</h3>\n" +
                    "Det kan være en fordel at have en pande som kun bruges til pandekager, for at undgå de hænger fast på panden.\n" +
                    "Da du ikke i så høj grad har fastbrændte rester eller slidt pande efter høj varme.\n" +
                    "\t"));

            RECIPES.get(i).setDescription(RECIPES.get(i).getDescription().replaceAll("\n", "<br/>"));

            RECIPES.get(i).addIngredient(new Ingredient("butter", 400, "gram"));
            RECIPES.get(i).addIngredient(new Ingredient("sugar", 400, "gram"));
            RECIPES.get(i).addIngredient(new Ingredient("flour", 400, "gram"));
            RECIPES.get(i).addIngredient(new Ingredient("baking powder", 1, "teske"));
        }


    }

    public List<Recipe> getAllRecipes() {
        return RECIPES;
    }

    public Recipe getRecipe(int index) {
        return RECIPES.get(index);
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
