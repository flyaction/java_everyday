package com.flyaction.demo.study.String;

public class Test2 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("hello");
        StringBuffer stringBuffer1 = new StringBuffer();
        //stringBuffer 底层数组的长度是 21
        //stringBuffer1 底层数组的长度是 16
        stringBuffer1.append("hello");
        System.out.println(stringBuffer.toString().equals(stringBuffer1.toString()));
        System.out.println(stringBuffer.length());
        System.out.println(stringBuffer1.length());
    }
}
