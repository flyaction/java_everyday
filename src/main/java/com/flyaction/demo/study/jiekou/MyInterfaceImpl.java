package com.flyaction.demo.study.jiekou;

public class MyInterfaceImpl implements MyInterface,MyInterface2{


    @Override
    public  void run() {
        System.out.println("实现了run方法");
    }

    @Override
    public void fly() {
        System.out.println("实现了fly方法");
    }
}
