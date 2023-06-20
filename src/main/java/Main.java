import model.LSD;
import model.enums.Ingredients;

import java.util.Arrays;

import static model.enums.Ingredients.*;

public class Main {
    public static void main(String[] args) {
        LSD lsd = new LSD("LSD", 40.0,
                Arrays.asList(INGREDIENT_1, INGREDIENT_2, SECRET_INGREDIENT),
                4) {

        };
        double v = lsd.calculatePriceForOneServing();
        System.out.println(v);
    }

}
