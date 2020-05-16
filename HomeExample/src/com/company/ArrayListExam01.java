package com.company;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Joker_Dong
 * @date 2020-5-16 14:31
 */

public class ArrayListExam01 {
    public static void main(String[] args) {
/*
        Example example1 = new Example();
        example1.setPrice(2000);
        example1.setLogo("MI");
        Example example2 = new Example();
        example2.setPrice(3000);
        example2.setLogo("HUAWEI");
        Example example3 = new Example();
        example3.setPrice(4000);
        example3.setLogo("APPLE");
*/
        Example example1 = new Example(2000, "mi");
        Example example2 = new Example(3000, "HUAWEI");
        Example example3 = new Example(4000, "APPLE");
        ArrayList<Example> examples = new ArrayList<>();
        examples.add(example1);
        examples.add(example2);
        examples.add(example3);
        System.out.println("可变数组在增加元素后大小： " + examples.size());

        System.out.println(examples.get(0));



        for (int i = 0; i < examples.size(); i++) {

            System.out.println(examples.get(i).getPrice() + "  " + examples.get(i).getLogo());


        }

    }
}
