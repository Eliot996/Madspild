package com.example.madspild.repository;

import com.example.madspild.models.Mealplan;

import java.util.ArrayList;
import java.util.List;

public class Mealplans {
    private ArrayList<Mealplan> mealplans = new ArrayList<>();

    public void add(Mealplan mealplan) {
        mealplans.add(mealplan);
    }

    public List<Mealplan> getMealplans() {
        return mealplans;
    }
}
