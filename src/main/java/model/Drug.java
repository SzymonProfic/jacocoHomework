package model;

import exceptions.IncorrectPriceForGramException;
import exceptions.InsufficientNumberOfIngredientsException;
import model.enums.Ingredients;

import java.util.*;

public abstract class Drug implements PriceForServingCalculator {
    private String name;
    private double basePriceForOneG;
    private List<Ingredients> ingredientsList = new ArrayList<>();

    public Drug(String name, double basePriceForOneG, List<Ingredients> ingredientsList) {
        if (ingredientsList.size() < 3) {
            throw new InsufficientNumberOfIngredientsException();
        }
        if (basePriceForOneG < 0) {
            throw new IncorrectPriceForGramException();
        }
        this.name = name;
        this.basePriceForOneG = basePriceForOneG;
        this.ingredientsList = ingredientsList;
    }

    public String getName() {
        return name;
    }

    public double getbasePriceForOneG() {
        return basePriceForOneG;
    }

    public List<Ingredients> getIngredientsList() {
        return ingredientsList;
    }

    @Override
    public double calculatePriceForOneServing() {
        return Optional.ofNullable(getIngredientsList())
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .mapToDouble(Ingredients::getPricePerIngredientPerServing)
                .reduce(getbasePriceForOneG(), Double::sum);
    }
}
