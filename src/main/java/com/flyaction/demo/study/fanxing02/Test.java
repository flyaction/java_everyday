package com.flyaction.demo.study.fanxing02;

public class Test {
    public static void main(String[] args) {
        Time<String,Integer,Float> time = new Time<>();
        time.setHour("十点");
        time.setMinute(10);
        time.setSecond(10.0f);
        System.out.println("现在的时间是"+time.getHour()+":"+time.getMinute()+":"+time.getSecond());
    }
}
