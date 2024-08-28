package com.flyaction.demo.study.math;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        Random random = new Random();
        //生成名单编号（时间戳+随机数）
        for(int i = 0;i<10;i++){
            //随机生成一个六位数
            System.out.println("订单"+i+"的编号是:"+System.currentTimeMillis()+random.nextInt(100000)+100000);
        }
    }
}
