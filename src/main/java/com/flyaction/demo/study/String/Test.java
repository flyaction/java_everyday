package com.flyaction.demo.study.String;

public class Test {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println(str1 == str2);
        String str3 = new String("World");
        String str4 = new String("World");
        System.out.println(str3 == str4);
        System.out.println(str1.equals(str2));
        System.out.println(str3.equals(str4));

    }
}
