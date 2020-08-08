package com.company.exam;

import org.springframework.transaction.jta.SpringJtaSynchronizationAdapter;

import java.util.Scanner;

/**
 * @author Joker_Dong
 * @date 2020-8-7 19:10
 */

public class CharNum {
    public static void main(String[] args) {
        charNum();
    }

    public static void charNum(){
        System.out.println("请输入数据");
        String str = new Scanner(System.in).nextLine();

        int bigletter = 0;
        int smallletter = 0;
        int specialletter = 0;
        int space = 0;
        int chinese = 0;
        int number = 0;


        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                bigletter++;
            }else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                smallletter++;

            }else if (Character.toString(str.charAt(i)).matches("[\\u4E00-\\u9FA5]+")){
                chinese++;
            }else if (Character.isSpaceChar(str.charAt(i))){
                space++;
            } else if(str.charAt(i) <= 9 && str.charAt(i) >= 0){
                number++;
            }else{
                specialletter++;
            }


        }
        // 大写字母
        System.out.println(bigletter);
        // 小写字母
        System.out.println(smallletter);
        // 中文字母 使用Character.toString(char c).matches("[\\u4E00-\\u9FA5]+") 识别中文
        System.out.println(chinese);
        // 空格 使用Character.isSpaceChar
        System.out.println(space);
        // 数字
        System.out.println(number);
        // 特殊字符
        System.out.println(specialletter);
    }
}
