package com.flyaction.demo.study.xiancheng;

public class Test02 {

    public static void main(String[] args) {

        MyRunnable myRunnable = new MyRunnable();
        MyRunnable2 myRunnable2 = new MyRunnable2();

        new Thread(myRunnable).start();
        new Thread(myRunnable2).start();

    }


}
