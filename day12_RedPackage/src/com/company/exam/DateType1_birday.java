package com.company.exam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Joker_Dong
 * @date 2020-8-8 17:44
 */

public class DateType1_birday {
    public static void main(String[] args) {
        birday();

    }

    public static void birday(){
        try {

            System.out.println("请输入自己的生日 -----》 1888-06-06 格式");
            Scanner scanner = new Scanner(System.in);
            String bir_str = scanner.nextLine();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd");
            Date parse = simpleDateFormat.parse(bir_str);
            long timestart = parse.getTime();
            Date date = new Date();
            long timeend = date.getTime();
            System.out.println("出生天数为： " + (timeend - timestart)/(1000*3600*24));

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
