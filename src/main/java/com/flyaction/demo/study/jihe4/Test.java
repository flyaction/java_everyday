package com.flyaction.demo.study.jihe4;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * @author action
 */
public class Test {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("Hello");
        linkedHashSet.add("World");
        linkedHashSet.add("Java");
        linkedHashSet.add("Hello");
        System.out.println("LinkedHastSet的长度是"+linkedHashSet.size());
        System.out.println("遍历LinkedHastSet");
        Iterator iterator = linkedHashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        linkedHashSet.remove("Java");
        System.out.println(linkedHashSet.contains("Java"));
    }
}
