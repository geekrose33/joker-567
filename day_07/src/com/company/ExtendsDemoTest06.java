package com.company;

/**
 * @author Joker_Dong
 * @date 2020-6-2 14:41
 */

public class ExtendsDemoTest06 {
    public static void main(String[] args) {
        NewPhone newPhone = new NewPhone();
        // 调用父类的成员方法
        newPhone.call();
        newPhone.sendMessage();
        // 调用子类重写的方法
        newPhone.showNum();
    }
}
