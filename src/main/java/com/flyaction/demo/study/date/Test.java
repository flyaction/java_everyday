package com.flyaction.demo.study.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String showDate = simpleDateFormat.format(date);
        System.out.println(showDate);

    }
}
