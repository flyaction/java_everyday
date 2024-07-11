package com.flyaction.demo.study.xianchengtongbu;

public class SynchronizedTest3 {

    public static void main(String[] args) {

        for(int i = 0;i < 5;i++){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {

                    SynchronizedTest3.test();
                }
            });
            thread.start();
        }

    }

    public static void test(){

        synchronized (SynchronizedTest3.class){
            System.out.println("start.............");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("end...............");
        }

    }

}
