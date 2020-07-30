package com.company.day15.exceptionDemo;

import java.io.FileNotFoundException;

/**
 * @author Joker_Dong
 * @date 2020-7-30 14:28
 */

public class Demo05 {
    public static void main(String[] args) {
        // finally
        try {
            show("Baidu.txt");
        }catch (FileNotFoundException e){
            e.printStackTrace();

        }finally {
            System.out.println("文件找到没啊");
        }
    }
    public static void show(String path) throws FileNotFoundException {
        if (!path.equals("baidu.txt")){
        throw new FileNotFoundException("文件搁哪呢");
    }
    }
}
