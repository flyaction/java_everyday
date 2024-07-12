package com.flyaction.demo.study.xianchengdanli;

public class Test2 {

    public static void main(String[] args) {

        for(int i = 0;i<10;i++){

            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    SingletonDemo singletonDemo = SingletonDemo.getInstance();
                }
            });

            thread.start();

        }

    }

}
