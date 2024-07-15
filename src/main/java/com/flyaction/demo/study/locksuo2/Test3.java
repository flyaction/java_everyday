package com.flyaction.demo.study.locksuo2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test3 {
    public static void main(String[] args) {

        Account2 account = new Account2();
        new Thread(()->{account.count();},"A").start();
        new Thread(()->{account.count();},"B").start();
        new Thread(()->{account.count();},"C").start();
    }
}


class Account2{

    private static int num;
    private Lock lock = new ReentrantLock();

    public void count() {
        lock.lock();
        num++;
        System.out.println(Thread.currentThread().getName()+"是当前的第"+num+"位访客");
        lock.unlock();
    }
}