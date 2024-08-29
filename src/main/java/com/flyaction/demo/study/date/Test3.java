package com.flyaction.demo.study.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test3 {
    public static void main(String[] args) {
        //计算今天所在的周是2020年的第几周
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println(simpleDateFormat.format(date));
    }
}
