package com.flyaction.demo.study.duoxiancheng2;

import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {

        Account account = new Account();
        new Thread(account,"A").start();
        new Thread(account,"B").start();

    }
}


class Account implements Runnable{
    private static int num = 0;
    @Override
    public void run() {
        num++;
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName()+"是当前第"+num+"位访客。");
    }
}
