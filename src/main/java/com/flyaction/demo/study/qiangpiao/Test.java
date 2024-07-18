package com.flyaction.demo.study.qiangpiao;

public class Test {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        new Thread(()->{ticket.sale();},"B").start();
        new Thread(()->{ticket.sale();},"A").start();
        new Thread(()->{ticket.sale();},"C").start();
    }
}
