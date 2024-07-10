package com.flyaction.demo.study.interrputed;

public class Test {

    public static void main(String[] args) {
        Thread thread = new Thread();
        // 打印 NEW
        System.out.println(thread.getState());
        thread.interrupt();
        System.out.println(thread.isInterrupted());
    }

}
