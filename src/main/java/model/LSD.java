package model;

import model.enums.Ingredients;

import java.util.List;

public class LSD extends Drug {
    private int numberOfSeenWawelDragons;

    public LSD(String name, double priceForOneG, List<Ingredients> ingredientsList, int numberOfSeenWawelDragons) {
        super(name, priceForOneG, ingredientsList);
        this.numberOfSeenWawelDragons = numberOfSeenWawelDragons;
    }

    public int getNumberOfSeenWawelDragons() {
        return numberOfSeenWawelDragons;
    }
}
