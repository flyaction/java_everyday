package com.flyaction.demo.study.fanxing05;

public class MyInterfaceImpl2 implements MyInterface<String>{

    private String obj;

    public MyInterfaceImpl2(String obj) {
        this.obj = obj;
    }

    @Override
    public String getValue() {
        return this.obj;
    }
}
