package com.flyaction.demo.study.locksuo2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test2 {
    public static void main(String[] args) {

        Account account = new Account();

        new Thread(account,"A").start();
        new Thread(account,"B").start();
        new Thread(account,"C").start();
    }
}


class Account implements Runnable{

    private static int num;
    private Lock lock = new ReentrantLock();

    @Override
    public void run() {
        lock.lock();
        num++;
        System.out.println(Thread.currentThread().getName()+"是当前的第"+num+"位访客");
        lock.unlock();
    }
}