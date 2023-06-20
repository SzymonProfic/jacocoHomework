package model;

import model.enums.Ingredients;

import java.util.List;

public class MDMA extends Drug {
    private static final int  BASIC_PHASE_LENGTH_IN_HOURS = 5 ;


    public MDMA(String name, double basePriceForOneG, List<Ingredients> ingredientsList) {
        super(name, basePriceForOneG, ingredientsList);
    }


    public static int getBASIC_PHASE_LENGTH_IN_HOURS() {
        return BASIC_PHASE_LENGTH_IN_HOURS;
    }


}
