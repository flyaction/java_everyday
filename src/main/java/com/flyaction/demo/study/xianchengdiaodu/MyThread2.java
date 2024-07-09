package com.flyaction.demo.study.xianchengdiaodu;

/**
 * @author action
 */
public class MyThread2 extends Thread{

    @Override
    public void run() {

        for (int i =0;i<10;i++){
            System.out.println(i+"---------------MyThread2");

        }

    }
}
