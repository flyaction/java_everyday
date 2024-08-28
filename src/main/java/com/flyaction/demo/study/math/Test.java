package com.flyaction.demo.study.math;

public class Test {
    public static void main(String[] args) {
        System.out.println("常量E"+Math.E);
        System.out.println("常量PI"+Math.PI);
        System.out.println("9的平方根"+Math.sqrt(9));
        System.out.println("8的立方根"+Math.cbrt(8));
        System.out.println("2的三次方"+Math.pow(2,3));
        System.out.println("较大值"+Math.max(6.5,1));
        System.out.println("-10.3的绝对值"+Math.abs(-10.3));
        System.out.println("向上取整："+Math.ceil(10.000001));
        System.out.println("向下取整"+Math.floor(10.99999999));
        System.out.println("随机数"+(int)Math.random()*10);
        System.out.println("四舍五入"+Math.rint(5.6));
    }
}
