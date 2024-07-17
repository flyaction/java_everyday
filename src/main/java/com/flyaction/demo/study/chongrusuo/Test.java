package com.flyaction.demo.study.chongrusuo;

import java.util.concurrent.TimeUnit;

public class Test {

    public static void main(String[] args) {
        Account account = new Account();

        new Thread(()->{account.count();},"A").start();
        new Thread(()->{account.count();},"B").start();

    }

}

/**
 * 将资源和Runnable进行解耦合
 */
class Account{
    private static int num;
    public void count(){
        num++;

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Thread.currentThread().getName()+"是当前的第"+num+"位访客");
    }
}