package com.company.day13;

import java.util.Calendar;
import java.util.Date;

/**
 * @author Joker_Dong
 * @date 2020-7-28 9:12
 */

public class TestCalendar04 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        System.out.println(date);

        Date date1 = new Date();
        System.out.println(date1);
    }
}
