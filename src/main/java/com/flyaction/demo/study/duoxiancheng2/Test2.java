package com.flyaction.demo.study.duoxiancheng2;

import java.util.concurrent.TimeUnit;

public class Test2 {
    public static void main(String[] args) {

        Account2 account2 = new Account2();
        new Thread(()->{
            account2.count();
        }, "A").start();
        new Thread(()->{
            account2.count();
        }, "B").start();

    }
}


class Account2{
    private static int num = 0;

    public synchronized void count() {
        num++;
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName()+"是当前第"+num+"位访客。");
    }
}
