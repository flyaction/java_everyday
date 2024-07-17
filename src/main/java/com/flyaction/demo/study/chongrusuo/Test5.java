package com.flyaction.demo.study.chongrusuo;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Test5 {

    public static void main(String[] args) {

        StopLock stopLock = new StopLock();
        Thread thread1 = new Thread(()->{stopLock.service();},"A");
        Thread thread2 = new Thread(()->{stopLock.service();},"B");
        thread1.start();
        thread2.start();

        try {
            TimeUnit.SECONDS.sleep(1);
            //线程中断
            thread2.interrupt();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class StopLock{
    private ReentrantLock reentrantLock = new ReentrantLock();
    public void service() {
        try {
            reentrantLock.lockInterruptibly();
            System.out.println(Thread.currentThread().getName()+"拿到锁");
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            reentrantLock.unlock();
        }
    }
}
