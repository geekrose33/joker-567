package com.company.exam;

/**
 * @author Joker_Dong
 * @date 2020-7-30 18:21
 */

public class Phone {
    private String logo;
    private int price;

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Phone(String logo, int price) {
        this.logo = logo;
        this.price = price;
    }
}
