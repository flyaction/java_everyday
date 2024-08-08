package com.flyaction.demo.study.fanxing05;

public class Test {
    public static void main(String[] args) {
        MyInterfaceImpl myInterface = new MyInterfaceImpl<String>("接口");
        String val = (String) myInterface.getValue();

        MyInterfaceImpl2 myInterface1 = new MyInterfaceImpl2("接口2");
        String val2 = myInterface1.getValue();
    }
}
