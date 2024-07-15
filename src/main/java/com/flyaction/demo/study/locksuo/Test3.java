package com.flyaction.demo.study.locksuo;

public class Test3 {

    public static void main(String[] args) {

        //lambda表达式
        new Thread(()->{
            for(int i = 0;i<10;i++){
                System.out.println("+++++++++++Runnable");
            }
        }).start();

    }

}
