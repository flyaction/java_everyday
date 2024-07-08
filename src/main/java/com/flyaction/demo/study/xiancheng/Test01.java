package com.flyaction.demo.study.xiancheng;

public class Test01 {

    public static void main(String[] args) {

        //实例化线程对象
        Thread thread1 = new MyThread();
        Thread thread2 = new MyThread2();

        //不能用run方法来调用线程的任务，因为run方法调用相当于普通对象的执行，并不会抢占CPU资源。
        thread1.start();
        thread2.start();


    }


}
