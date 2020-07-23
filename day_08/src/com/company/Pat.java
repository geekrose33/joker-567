package com.company;

public interface Pat {
    public void ShouYang();

    public void show();

    public default void method() {
        System.out.println("Pat");
    }

}
