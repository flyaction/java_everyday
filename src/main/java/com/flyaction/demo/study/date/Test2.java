package com.flyaction.demo.study.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test2 {
    public static void main(String[] args) {
        //计算今天所在的周是2020年的第几周
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR,2020);
        //1月为0，2月为1
        calendar.set(Calendar.MONTH,0);
        calendar.set(Calendar.DAY_OF_MONTH,9);
        System.out.println(calendar.get(Calendar.WEEK_OF_YEAR));

        //今天之后的63天是几月几号
        int days = calendar.get(Calendar.DAY_OF_YEAR);
        days += 10;
        calendar.set(Calendar.DAY_OF_YEAR,days);
        Date date = calendar.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(simpleDateFormat.format(date));
    }
}
