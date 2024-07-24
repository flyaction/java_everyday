package com.flyaction.demo.study.duoxiancheng5;

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
    public synchronized void increment(){
        while(num != 0){
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        num++;
        this.notify();
        System.out.println(Thread.currentThread().getName()+"生产了汉堡"+num);
    }
    public synchronized void decrement(){
        while(num == 0){
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        num--;
        this.notify();
        System.out.println(Thread.currentThread().getName()+"消费了汉堡"+num);
    }
}
