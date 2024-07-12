package com.flyaction.demo.study.xianchengdanli;

public class SingletonDemo {

    private volatile static SingletonDemo singletonDemo;

    private SingletonDemo(){
        System.out.println("创建了SingletonDemo...");
    }

    public static SingletonDemo getInstance(){

        if(singletonDemo == null){
            synchronized (SingletonDemo.class){
                if(singletonDemo == null){
                    singletonDemo = new SingletonDemo();
                }
            }
        }

        return singletonDemo;
    }

}
