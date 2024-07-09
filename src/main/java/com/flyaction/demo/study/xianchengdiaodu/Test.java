package com.flyaction.demo.study.xianchengdiaodu;

public class Test {

    public static void main(String[] args) {

//        MyThread thread = new MyThread();
//        thread.start();

        MyThread2 thread = new MyThread2();
        try {
            thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread.start();

    }

}
