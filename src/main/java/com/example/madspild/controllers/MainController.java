package com.example.madspild.controllers;

import com.example.madspild.repository.Recipes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MainController {

    private final Recipes RECIPES = new Recipes();

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
        return "Recipe";
    }
}
