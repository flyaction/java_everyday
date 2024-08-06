package com.flyaction.demo.study.jihe05;

import java.util.Iterator;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(6);
        treeSet.add(2);
        treeSet.add(5);
        treeSet.add(4);
        treeSet.add(1);
        System.out.println("treeSet的长度是："+treeSet.size());
        System.out.println("treeSet遍历：");
        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
