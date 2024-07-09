package com.flyaction.demo.study.xianchengyeild;

public class YieldThread1 extends Thread{

    @Override
    public void run() {
        for(int i = 0;i< 10;i++){

            if(i == 5){
                Thread.yield();
            }

            System.out.println(Thread.currentThread().getName()+"---------"+i);
        }
    }
}
