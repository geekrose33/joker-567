package com.company.exam.staticTest;

/**
 * @author Joker_Dong
 * @date 2020-8-9 16:58
 */

public class Fu {
    static int staticNum;
    public String str;
    static {
        staticNum = 10;

        System.out.println("父类静态代码块被调用");
    }
    {
        System.out.println("父类非静态代码块被调用");
    }
    public static void StaticFuMethod(){
        System.out.println("父类静态方法被调用");
        // 由于父类静态方法先于非静态变量执行 也就是非静态变量还没初始化 所以不能给他赋值
    }
    public void FuMethod(){
        System.out.println("父类非静态方法被调用");
        str = "非静态变量被赋值";
    }
    public Fu(String str){
        this.str = str;
        System.out.println("父类无参构造被调用");
    }

    public static void main(String[] args) {
        System.out.println("主方法被调用");
        Zi zi = new Zi("str");
    }
}
