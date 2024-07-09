package com.flyaction.demo.study.xianchengyeild;

public class YieldThread2 extends Thread{

    @Override
    public void run() {
        for(int i = 0;i< 10;i++){
            System.out.println(Thread.currentThread().getName()+"---------"+i);
        }
    }
}
