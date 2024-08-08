package com.flyaction.demo.study.fanxing05;

public class MyInterfaceImpl<T> implements MyInterface<T>{

    private T obj;

    public MyInterfaceImpl(T obj) {
        this.obj = obj;
    }

    @Override
    public T getValue() {
        return this.obj;
    }
}
