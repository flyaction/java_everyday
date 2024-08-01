package com.flyaction.demo.study.duoxiancheng13;

import java.util.concurrent.TimeUnit;

public class Test2 {
    private static volatile int num = 0;

    public static void main(String[] args) {
        /**
         *
         */
        new Thread(()->{
            while(num == 0){
                System.out.println("------Thread------");
            }
        }).start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        num = 1;
        System.out.println(num);

    }

}
