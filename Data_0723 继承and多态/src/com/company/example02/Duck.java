package com.company.example02;

/**
 * @author Joker_Dong
 * @date 2020-7-23 14:40
 */

public class Duck extends Poultry {
    @Override
    public void showSymptom(String symptom){
        System.out.println("症状为： " + getSymptom());
    }

    public Duck() {
    }

    public Duck(String name, int age, String symptom, String illness) {
        super(name, age, symptom, illness);
    }
}
