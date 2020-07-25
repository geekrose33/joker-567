package com.company.example01;

/**
 * @author Joker_Dong
 * @date 2020-7-23 14:12
 */

public abstract class A {
    private int numa = 10;

    public int getNuma() {
        return numa;
    }

    public void setNuma(int numa) {
        this.numa = numa;
    }

    public abstract void showA();
}
