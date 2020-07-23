package com.company.HomeWork2;

public interface A {
    public abstract void showA();

    private static void show10(String str) {
        for (int i = 0; i < 10; i++) {
            System.out.println("第" + i + "次 " + str);
        }
    }

    public static void showB10() {
        show10("B");
    }


    public static void showC10() {
        show10("C");
    }


}
