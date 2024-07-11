package com.flyaction.demo.study.xianchengtongbu;

public class SynchronizedTest2 {

    public static void main(String[] args) {

        for(int i = 0;i < 5;i++){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {

                    SynchronizedTest2 synchronizedTest2 = new SynchronizedTest2();
                    synchronizedTest2.test();
                }
            });
            thread.start();
        }

    }

    public synchronized void test(){
        System.out.println("start.............");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("end...............");
    }


}
