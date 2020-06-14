package com.company;

/**
 * @author Joker_Dong
 * @date 2020-6-14 15:31
 */

public class Armour {
    private String name;
    // 装备名称
    private int protact;
    // 防御值


    public Armour(String name, int protact) {
        this.name = name;
        this.protact = protact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProtact() {
        return protact;
    }

    public void setProtact(int protact) {
        this.protact = protact;
    }
}
