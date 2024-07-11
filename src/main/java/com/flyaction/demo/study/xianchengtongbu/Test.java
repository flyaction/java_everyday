package com.flyaction.demo.study.xianchengtongbu;

public class Test {

    public static void main(String[] args) {

        Account account = new Account();
        Thread thread1 = new Thread(account,"张三");
        Thread thread2 = new Thread(account,"李四");
        thread1.start();
        thread2.start();


//        for(int i = 0;i< 10;i++){
//            Thread thread = new Thread(account,"线程"+i);
//            thread.start();
//        }

    }

}
