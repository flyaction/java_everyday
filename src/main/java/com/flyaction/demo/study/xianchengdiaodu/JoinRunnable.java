package com.flyaction.demo.study.xianchengdiaodu;

public class JoinRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0;i<20;i++){

            System.out.println(i+"+JoinRunnable+++++++++++");

        }
    }
}
