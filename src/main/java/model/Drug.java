package model;

import model.enums.Ingredients;

import java.util.ArrayList;
import java.util.List;

public abstract class Drug {
    private String name;
    private double priceForOneG;
    private List<Ingredients> ingredientsList = new ArrayList<>();

    public Drug(String name, double priceForOneG, List<Ingredients> ingredientsList) {
        this.name = name;
        this.priceForOneG = priceForOneG;
        this.ingredientsList = ingredientsList;
    }
}
