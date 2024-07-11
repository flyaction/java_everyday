package com.flyaction.demo.study.xianchengtongbu;

public class SynchronizedTest9 {

    public static void main(String[] args) {


        SynchronizedTest9 synchronizedTest9 = new SynchronizedTest9();

        for(int i = 0;i < 5;i++){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    synchronizedTest9.test();
                }
            });
            thread.start();
        }

    }

    public void test(){

        synchronized (this){
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
