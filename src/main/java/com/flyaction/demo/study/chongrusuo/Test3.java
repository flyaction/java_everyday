package com.flyaction.demo.study.chongrusuo;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Test3 {

    public static void main(String[] args) {
        Account3 account = new Account3();

        new Thread(()->{account.count();},"A").start();
        new Thread(()->{account.count();},"B").start();

    }

}

/**
 * 将资源和Runnable进行解耦合
 */
class Account3{
    private static int num;
    private ReentrantLock reentrantLock = new ReentrantLock();

    public void count(){

        reentrantLock.lock();

        num++;
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Thread.currentThread().getName()+"是当前的第"+num+"位访客");

        reentrantLock.unlock();
    }
}