package com.company;

/**
 * @author Joker_Dong
 * @date 2020-6-2 14:34
 */

public class NewPhone extends Phone{

    // 重写父类的来电显示功能 并且增加自己的显示姓名和头像图片
    @Override
    public void showNum(){
        // 调用父类已经存在的功能 使用super
        super.showNum();
        System.out.println("显示来电姓名");
        System.out.println("显示来电头像");
    }
}
