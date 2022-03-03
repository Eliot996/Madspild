package com.example.madspild.controllers;

import com.example.madspild.models.Mealplan;
import com.example.madspild.repository.Mealplans;
import com.example.madspild.repository.Recipes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MainController {

    private final Recipes RECIPES = new Recipes();
    private final Mealplans MEALPLANS = new Mealplans(RECIPES);

    @GetMapping
    public String landing() {
        return "LandingPage";
    }

    @GetMapping("/opskrifter")
    public String allRecipes(Model model) {
        model.addAttribute("recipes", RECIPES.getAllRecipes());
        return "Recipes";
    }

    @GetMapping("/opskrifter/{name}")
    public String allRecipes(Model model, @PathVariable() String name) {
        model.addAttribute("recipe", RECIPES.getRecipe(name));
        model.addAttribute("ingredients", RECIPES.getRecipe(name).getIngredients());
        return "Recipe";
    }

    @GetMapping("/omMadspild")
    public String about(){
        return "LandingPageAbout";
    }

    @GetMapping("/minMadplan")
    public String mealPlan(Model model){
        model.addAttribute("mealplans", MEALPLANS.getMealplans());
        return "mealPlans";
    }

    /*@PostMapping("/minMadplan")
    public String mealPlan(@ModelAttribute Mealplan mealplan, Model model){
        Object mealplantemp = model.getAttribute("mealplan");
        Mealplan mealplan1 = ((Mealplan) mealplantemp);
        return "mealPlanResult";
    }*/


}
