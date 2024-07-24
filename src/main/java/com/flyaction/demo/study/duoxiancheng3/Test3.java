package com.flyaction.demo.study.duoxiancheng3;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test3 {

    public static void main(String[] args) {

        Ticket2 ticket = new Ticket2();

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


class Ticket2{
    private Integer saleNum = 0;
    private Integer lastNum = 30;
    // fair 公平锁和非公平锁
    private Lock lock = new ReentrantLock(true);

    public  void sale(){
        lock.lock();
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
        lock.unlock();
    }
    
}