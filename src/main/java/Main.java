import model.LSD;
import model.enums.Ingredients;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LSD lsd = new LSD("LSD", 40.0,
                Arrays.asList(Ingredients.INGREDIENT_1, Ingredients.INGREDIENT_2, Ingredients.SECRET_INGREDIENT),
                4) {

        };
        double v = lsd.calculatePriceForOneServing();
        System.out.println(v);
    }
}
