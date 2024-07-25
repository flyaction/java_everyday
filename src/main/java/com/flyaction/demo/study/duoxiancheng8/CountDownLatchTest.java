package com.flyaction.demo.study.duoxiancheng8;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {
    public static void main(String[] args) {

        //创建一个CountDownLatch
        CountDownLatch countDownLatch = new CountDownLatch(100);

        new Thread(()->{
            for(int i=0;i<100;i++){
                System.out.println("+++++++++++++++++Thread");
                countDownLatch.countDown();
            }
        }).start();

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for(int i=0;i<100;i++){
            System.out.println("Main----------------");
        }
    }
}
