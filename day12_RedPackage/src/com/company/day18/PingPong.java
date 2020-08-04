package com.company.day18;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Joker_Dong
 * @date 2020-8-4 18:47
 */

public class PingPong {
    public static void main(String[] args) {
        ArrayList<String> jia = new ArrayList<>();
        ArrayList<String> yi = new ArrayList<>();
        jia.add("c");
        jia.add("a");
        jia.add("b");
        yi.add("x");
        yi.add("y");
        yi.add("z");

        HashMap<String, String> match = new HashMap<>();
        for (int j = 0; j < jia.size(); j++) {

            match.put(jia.get(j), null);

            for (int i = 0; i < yi.size(); i++) {


                if (jia.get(j) == "a" && yi.get(i) == "x") {
                    continue;
                } else if (jia.get(j) == "c" && yi.get(i) == "x") {
                    continue;
                } else if (jia.get(j) == "c" && yi.get(i) == "z") {
                    continue;
                } else {
                    if (j == 0) {
                        match.put(jia.get(j), yi.get(i));
                    } else if (j == 1 & yi.get(i) != match.get(jia.get(j - 1))) {

                        match.put(jia.get(j), yi.get(i));


                    }else if (j == 2 & (yi.get(i) != match.get(jia.get(j - 1)) && yi.get(i) != match.get(jia.get(j - 2))))
                        match.put(jia.get(j), yi.get(i));


                }


            }
        }
        System.out.println(match);
    }

    }

