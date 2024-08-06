package com.flyaction.demo.study.jihe03;

import java.util.HashSet;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("Hello");
        set.add("World");
        set.add("Java");
        set.add("Hello");
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("==================");
        set.remove("World");
        iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(set.contains("Java"));

    }
}
