package com.flyaction.demo.study.duoxiancheng4;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Test {
    public static void main(String[] args) {
        TimeLock timeLock = new TimeLock();
        new Thread(()->{
            timeLock.getLock();
        },"A").start();
        new Thread(()->{
            timeLock.getLock();
        },"B").start();
    }
}

class TimeLock{
    private ReentrantLock lock = new ReentrantLock();

    public void getLock(){
        try {
            if(lock.tryLock(3, TimeUnit.SECONDS)){
                System.out.println(Thread.currentThread().getName()+"拿到了锁");
                TimeUnit.SECONDS.sleep(5);
            }else{
                System.out.println(Thread.currentThread().getName()+"拿不到锁");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            if(lock.isHeldByCurrentThread()){
                lock.unlock();
            }
        }
    }

}


