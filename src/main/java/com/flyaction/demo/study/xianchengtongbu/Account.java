package com.flyaction.demo.study.xianchengtongbu;

/**
 * @author action
 */
public class Account implements Runnable{

    private static int num;

    @Override
    public synchronized void run() {

        num++;

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Thread.currentThread().getName()+"是当前的第"+num+"位访客");
    }
}
