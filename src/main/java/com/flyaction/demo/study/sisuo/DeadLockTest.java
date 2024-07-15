package com.flyaction.demo.study.sisuo;

public class DeadLockTest {

    public static void main(String[] args) {

        DeadLockRunnable deadLockRunnable1 = new DeadLockRunnable();
        deadLockRunnable1.num = 1;
        DeadLockRunnable deadLockRunnable2 = new DeadLockRunnable();
        deadLockRunnable2.num = 2;

        new Thread(deadLockRunnable1,"张三").start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        new Thread(deadLockRunnable2,"李四").start();


    }

}
