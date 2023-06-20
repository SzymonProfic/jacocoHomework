package model;

import model.enums.FacialExpressions;
import model.enums.Ingredients;

import java.util.List;

public class Mefedron extends Drug {
    private FacialExpressions facialExpression;

    public Mefedron(String name, double priceForOneG, List<Ingredients> ingredientsList, FacialExpressions facialExpression) {
        super(name, priceForOneG, ingredientsList);
        this.facialExpression = facialExpression;
    }


}
