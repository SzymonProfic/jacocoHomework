package model;

import model.enums.Ingredients;

import java.util.List;

public class LSD extends Drug {
    private int numberOfSeenWawelDragons;

    public LSD(String name, double basePriceForOneG, List<Ingredients> ingredientsList, int numberOfSeenWawelDragons) {
        super(name, basePriceForOneG, ingredientsList);
        this.numberOfSeenWawelDragons = numberOfSeenWawelDragons;
    }

    public int getNumberOfSeenWawelDragons() {
        return numberOfSeenWawelDragons;
    }


    // jesli drugQuality ok to liczba smoków się zwiększa
}
