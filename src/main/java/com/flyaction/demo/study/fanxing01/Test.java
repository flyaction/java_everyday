package com.flyaction.demo.study.fanxing01;

public class Test {
    public static void main(String[] args) {
        Time<Integer> time1 = new Time<>();
        time1.setValue(10);
        System.out.println("现在的时间是"+ time1.getValue());
        Time<String> time2 = new Time<>();
        time2.setValue("十点整");
        System.out.println("现在的时间是"+time2.getValue());

    }
}
