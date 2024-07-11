package com.flyaction.demo.study.xianchengtongbu;

public class SynchronizedTest {

    public static void main(String[] args) {

        for(int i = 0;i < 5;i++){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    SynchronizedTest.test();
                }
            });
            thread.start();
        }

    }

    public synchronized static void test(){
        System.out.println("start.............");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("end...............");
    }


}
