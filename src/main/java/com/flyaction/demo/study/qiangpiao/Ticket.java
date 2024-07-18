package com.flyaction.demo.study.qiangpiao;

import java.util.concurrent.TimeUnit;

public class Ticket {
    //剩余数量
    private int surplusCount = 7;
    //已经售出数量
    private int outCount = 0;

    public synchronized void sale(){
        while (surplusCount > 0){
            try {
                TimeUnit.MICROSECONDS.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (surplusCount == 0){
                return;
            }
            surplusCount--;
            outCount++;
            if(surplusCount == 0){
                System.out.println(Thread.currentThread().getName()+"售出第"+outCount+"张票，球票已售罄");
            }else {
                System.out.println(Thread.currentThread().getName()+"售出第"+outCount+"张票，还剩"+surplusCount+"张票");
            }
        }
    }


}
