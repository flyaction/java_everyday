package com.flyaction.demo.study.chongrusuo;

import java.util.concurrent.TimeUnit;

public class Test2 {

    public static void main(String[] args) {
        Account2 account = new Account2();

        new Thread(account,"A").start();
        new Thread(account,"B").start();

    }

}


class Account2 implements Runnable{
    private static int num;
    @Override
    public void run() {
        num++;
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName()+"是当前的第"+num+"位访客");
    }
}