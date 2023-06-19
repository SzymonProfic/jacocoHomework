package model;

import model.enums.Ingredients;

import java.util.List;

public class MDMA extends Drug {
    int lengthOfFaze;

    public MDMA(String name, double priceForOneG, List<Ingredients> ingredientsList) {
        super(name, priceForOneG, ingredientsList);
    }

    public int getLengthOfFaze() {
        return lengthOfFaze;
    }
}
