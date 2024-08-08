package com.flyaction.demo.study.fanxing04;

public class Time<T> {
    public static void main(String[] args) {
        test(new Time<Float>());
        test(new Time<Integer>());
        test(new Time<Double>());
        //test(new Time<String>()); //报错，上限是Number
        test2(new Time<String>());
        test2(new Time<Object>());
        //test2(new Time<Integer>());//报错，下限是String
    }
    /**
     * 泛型上限
     * @param time
     */
    public static void test(Time<? extends Number> time){

    }
    /**
     * 泛型下限
     * @param time
     */
    public static void test2(Time<? super String> time){

    }
}
