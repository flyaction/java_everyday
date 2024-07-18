package com.flyaction.demo.study.shengchanxiaofei;

public class Test {
    public static void main(String[] args) {

        Container container = new Container();
        Producer producer = new Producer(container);
        Consumer consumer = new Consumer(container);

        new Thread(()->{producer.product();}).start();
        new Thread(()->{consumer.consum();}).start();

    }
}
