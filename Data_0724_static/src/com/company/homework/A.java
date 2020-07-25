package com.company.homework;

public interface A {
    public abstract void showA();
    private static void show10(String str){
        for (int i = 0; i < 10; i++) {
            System.out.print(str + "\t");
        }
    }
    public static void showB10(){
        show10("BBBB");
    }
    public static void showC10(){
        show10("CCCC");
    }

//    public default void showB10(){
//        show10("B");
//    }
//    public default void showC10(){
//        show10("C");
//    }


}
