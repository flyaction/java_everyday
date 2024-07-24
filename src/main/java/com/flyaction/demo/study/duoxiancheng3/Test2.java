package com.flyaction.demo.study.duoxiancheng3;

import java.util.concurrent.TimeUnit;

public class Test2 {

    public static void main(String[] args) {

        Ticket ticket = new Ticket();

        new Thread(()->{
            for(int i=0;i<40;i++){
                ticket.sale();
            }
        },"A").start();
        new Thread(()->{
            for(int i=0;i<40;i++){
                ticket.sale();
            }
        },"B").start();

    }

}


class Ticket{
    private Integer saleNum = 0;
    private Integer lastNum = 30;

    public synchronized void sale(){
        if(lastNum > 0){
            saleNum++;
            lastNum--;
            try {
                TimeUnit.MICROSECONDS.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+"卖出了第"+saleNum+"票，剩余"+lastNum+"张票");
        }
    }
    
}