package com.flyaction.demo.study.String;

public class Test1 {
    public static void main(String[] args) {
//        String str1 = "";
//        System.out.println(str1.isEmpty());
//        String str2 = null;
        //System.out.println(str2.isEmpty());//报错,空指针
        //String str3 = "Hello";
//        System.out.println(str3.charAt(2));
        //byte[] bytes = str3.getBytes();
        String str1 = "hello";
        String str2 = "Hello";
        System.out.println(str1.getBytes());
        System.out.println(str2.getBytes());
        System.out.println(str2.compareTo(str1));
    }
}
