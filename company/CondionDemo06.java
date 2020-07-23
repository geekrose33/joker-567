package com.company;

import com.sun.deploy.security.SelectableSecurityManager;
import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.util.Scanner;

public class CondionDemo06 {
    public static void main(String[] args) {
        // 条件控制
        //流程控制：
        // 1. 顺序结构
        // 2. 选择结构 if switch
        // 单分支
//        int time = 11;
//        if(time >= 11 && time <= 14){
//
//            System.out.println("休息时间到");
//
//        }

        // 双分支
//        int time = 11;
//        if(time >= 10 %% time <= 14){
//            System.out.println("吃饭");
//        }else{
//            System.out.println("学习");
//        }
//        System.out.println("请输入一个整数");
//        Scanner scanner = new Scanner(System.in);
//        ///创建扫描器对象
//        int num = scanner.nextInt();
//        System.out.println("您输入的整数为" + num);
//
//
//        if (num%2 == 0){
//
//            System.out.println("输入的数是偶数");
//
//        }else{
//
//            System.out.println("输入的数是奇数");
//        }
//
//        if (true){
//            System.out.println("Hello");
//        }
//        if (true) System.out.println("Nice to meet you.");


        //在控制台中接受参数

        // 多分支
//        if(condition 1){}else if(condition2){}else if(condition3){}


        // 3. 循环结构 for while do while
        //
//        System.out.println("请输入1到7的数字");
//        Scanner scanner = new Scanner(System.in);
//        int num =scanner.nextInt();
//        if (num <= 7 && num >= 1){
//            if (num == 1){
//                System.out.println("今天是星期一");
//            }
//            if (num == 2){
//                System.out.println("今天是星期二");
//            }
//            if (num == 3){
//                System.out.println("今天是星期三");
//            }
//            if (num == 4){
//                System.out.println("今天是星期四");
//            }
//            if (num == 5){
//                System.out.println("今天是星期五");
//            }
//            if (num == 6){
//                System.out.println("今天是星期六");
//            }
//            if (num == 7){
//                System.out.println("今天是星期日");
//            }
//        }else{
//            System.out.println("没有这样的日期");
//        }
//
//        Scanner scanner1 = new Scanner(System.in);
//        int i = scanner.nextInt();
//


//        System.out.println("请输入小明的成绩");
//        Scanner scanner = new Scanner(System.in);
//        int grade = scanner.nextInt();
//        if (grade >= 0 && grade <= 100){
//            if (grade >= 95 && grade <= 100){
//                System.out.println("山地自行车一辆");
//            }
//            if (grade >= 90 && grade <= 94){
//                System.out.println("游乐场玩一次");
//            }
//            if (grade >= 80 && grade <= 89){
//                System.out.println("变形金刚玩具一个");
//            }
//            if (grade <= 80){
//                System.out.println("胖揍一顿");
//            }
//        }else{
//            System.out.println("请输入合理成绩");
//        }


//        System.out.println("请输入三个整数");
//        Scanner scanner = new Scanner(System.in);
//
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//        int num3 = scanner.nextInt();
//
//        if (num1 >= num2 && num1 >= num3){
//            System.out.println("最大值为"+num1);
//
//        }else if (num2 >= num1 && num2 >= num3){
//            System.out.println("最大值为"+num2);
//        }else{
//            System.out.println("最大值为"+num3);
//        }


        // switch语句 勇于做固定值判断
//        switch(表达式){
//            case 1:
//                语句体；
//                break;
//            case 2:
//                表达式；
//                break;
//            defalt:
//                语句体；
//                break;
//        }

        // case穿透   如果case中不写break将出现case穿透现象
        // 也就是说不会判断下一个case值，直接向后运行，直到遇到break或者switch语句结束
//        System.out.println("请输入小明的成绩");
//        Scanner scanner = new Scanner(System.in);
//        int i = scanner.nextInt();
//
//        switch (i/10){
//            case 10:
//            case 9:
////                if (i/10 >= 9)
//                System.out.println("山地自行车一辆");
//                break;
//            case 8:
////                if (i/10 >= 8 && i/10 < 9)
//                System.out.println("游乐场玩一次");
//                break;
//            case 7:
////                if (i/10 >= 7 && i/10 <8)
//                System.out.println("变形金刚玩具一个");
//                break;
//            case 6:
//            case 5:
//            case 4:
//            case 3:
//            case 2:
//            case 1:
//
////                if (i/10 < 8)
//
//                System.out.println("胖揍一顿");
//                break;
//             default:
//                System.out.println("请输入正确数据");
//                break;
//        }
//        System.out.println("请输入工人工龄");
//        Scanner scanner = new Scanner(System.in);
//        int i = scanner.nextInt();
//        System.out.println("请输入员工基本工资");
//        int money = scanner.nextInt();
//        switch (i){
//            case 15:
//            case 14:
//            case 13:
//            case 12:
//            case 11:
//                money = money + 5000;
//                System.out.println("工资为" + money);
//                break;
//            case 10:
//            case 9:
//            case 8:
//            case 7:
//            case 6:
//            case 5:
//                money = money + 2500;
//                System.out.println("工资为" + money);
//                break;
//            case 4:
//            case 3:
//                money = money + 599;
//                System.out.println("工资为" + money);
//                break;
//            case 2:
//            case 1:
//                money = money + 200;
//                System.out.println("工资为" + money);
//                break;
//
//            default:
//                System.out.println("请输入合法工龄");
//                break;
//
//
//        }
// ctrl + enter 快速导包

        // ctrl + y 删除光标所在行
        // ctrl + D 复制光标所在行
        // ctrl + alt + l 格式化代码
        // ctrl + / 注释
        // alt + shift + ↑ ↓ 移动代码所在行

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入参与运算的整数");
//        int a = scanner.nextInt();
//
//        System.out.println("请输入参与运算的整数");
//        int b = scanner.nextInt();
//
//        System.out.println("请输入运算代表数");
//        int c = scanner.nextInt();
//
//        switch(c){
//            case 0:
//                System.out.println("两数相加得"+(a + b) );
//                break;
//            case 1:
//                System.out.println("两数相减得"+(a - b) );
//                break;
//            case 2:
//                System.out.println("两数相乘得"+(a * b) );
//                break;
//            case 3:
//                System.out.println("两数相除得"+(a / b));
//                break;
//            default:
//                System.out.println("请输入合理数据");
//                break;
//        }
//        System.out.println("请输入要判断得数字");
//        Scanner scanner = new Scanner(System.in);
//        int i = scanner.nextInt();
//        if (i >= 100 && i <= 999){
//            if (i == java.lang.Math.pow((i/100),3) + java.lang.Math.pow((i%10),3)
//                    + java.lang.Math.pow(((i/10)%10),3)){
//                System.out.println("是水仙花数");
//            }else{
//                System.out.println("不是水仙花数");
//            }
//
//        }else{
//            System.out.println("请输入三位数");
//        }
        System.out.println("请输入小明左手纸牌数");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("请输入小明右手纸牌数");
        int b = scanner.nextInt();

        System.out.println("互换前小明手中纸牌左手为" + a + "互换前小明手中纸牌右手为" + b);
        int c;
        c = a;
        a = b;
        b = c;

        System.out.println("互换后小明手中纸牌左手为" + a + "互换后小明手中纸牌右手为" + b);

        //（关系表达式）？表达式1：表达式2；
        // 先执行关系表达式，看其结果是true 还是 false
        // 如果是 true 就执行表达式1 如果为false 就执行表达式2
    }
}
