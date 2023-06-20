package model.enums;

public enum Ingredients {
    INGREDIENT_1(12.0),
    INGREDIENT_2(25.0),
    SECRET_INGREDIENT(50.0),
    ANOTHER_SHITTY_INGREDIENT(5.0);

    private double pricePerIngredientPerServing;

    Ingredients(double pricePerIngredientPerServing) {
        this.pricePerIngredientPerServing = pricePerIngredientPerServing;
    }

    public double getPricePerIngredientPerServing() {
        return pricePerIngredientPerServing;
    }
}
