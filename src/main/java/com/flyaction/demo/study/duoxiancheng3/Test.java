package com.flyaction.demo.study.duoxiancheng3;

import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        Data data = new Data();
        new Thread(()->{
            data.func1();
        },"A").start();
        new Thread(()->{
            data.func2();
        },"B").start();
    }
}

class Data{

    public synchronized void func1(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("1............");
    }
    public synchronized void func2(){
        System.out.println("2............");
    }
}
