package com.flyaction.demo.study.duoxiancheng6;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test {
    public static void main(String[] args) {
        Data data = new Data();
        new Thread(()->{
            for(int i = 0;i<30;i++){
                data.increment();
            }
        },"A").start();

        new Thread(()->{
            for(int i = 0;i<30;i++){
                data.decrement();
            }
        },"B").start();

    }
}
class Data{
    private Integer num = 0;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    public void increment(){
        lock.lock();
        while(num != 0){
            try {
                condition.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        num++;
        condition.signal();
        System.out.println(Thread.currentThread().getName()+"生产了汉堡"+num);
        lock.unlock();
    }
    public void decrement(){
        lock.lock();
        while(num == 0){
            try {
                condition.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        num--;
        condition.signal();
        System.out.println(Thread.currentThread().getName()+"消费了汉堡"+num);
        lock.unlock();
    }
}
