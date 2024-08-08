package com.flyaction.demo.study.fanxing03;

import java.util.ArrayList;

/**
 * @author action
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        test(list1);
        test(list2);
    }
    public static void test(ArrayList<?> list){
        System.out.println(list);
    }
}
