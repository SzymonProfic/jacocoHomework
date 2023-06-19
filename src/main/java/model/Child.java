package model;

import exceptions.TheKidIsAlreadyDeadException;

import java.util.ArrayList;
import java.util.List;

public class Child {
    private String name;
    private String surname;
    private int age;
    private List<Drug> ownedDrugList = new ArrayList<>();
    private static final int MAX_NUMBER_OF_OWNED_DRUGS = 5;

    public Child(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public List<Drug> getOwnedDrugList() {
        return ownedDrugList;
    }

    public void buyDrug(Drug drug) {
        if (ownedDrugList.size() >= MAX_NUMBER_OF_OWNED_DRUGS) {
            throw new TheKidIsAlreadyDeadException("Kid overdosed. Rest in pepperoni");
        }
        ownedDrugList.add(drug);
    }


}
