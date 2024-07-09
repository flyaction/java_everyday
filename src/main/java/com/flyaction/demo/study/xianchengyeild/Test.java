package com.flyaction.demo.study.xianchengyeild;

public class Test {

    public static void main(String[] args) {
        YieldThread1 thread = new YieldThread1();
        thread.setName("线程1");
        thread.start();

        YieldThread2 thread2 = new YieldThread2();
        thread2.setName("线程2");
        thread2.start();

    }
}
