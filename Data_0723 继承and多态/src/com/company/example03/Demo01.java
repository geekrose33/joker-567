package com.company.example03;

/**
 * @author Joker_Dong
 * @date 2020-7-24 8:47
 */

public class Demo01 {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        System.out.println(arrayToString(arr));
    }
    public static String arrayToString(int[] arr){
        String s = new String("[");
        // 遍历
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1){
                s = s.concat(arr[i] + "]");
            }else{
                    s = s.concat(arr[i] + "#");
                    /// 数字自动转化为字符串类型 concat

            }
        }
        return s;
    }
}
