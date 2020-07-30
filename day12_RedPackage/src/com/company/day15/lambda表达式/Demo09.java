package com.company.day15.lambda表达式;

/**
 * @author Joker_Dong
 * @date 2020-7-30 17:00
 */

public class Demo09 {
    public static void main(String[] args) {
        // 使用lambda表达式调用测试
        invokeShow(100,a -> a + 100);


    }
    public static void invokeShow(int a,Show show){
        show.showNum(a);
        System.out.println(a);
}

}
