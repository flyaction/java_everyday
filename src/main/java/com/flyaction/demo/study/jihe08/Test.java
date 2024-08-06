package com.flyaction.demo.study.jihe08;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author action
 */
public class Test {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap();
        treeMap.put(3,"Java");
        treeMap.put(5,"JavaME");
        treeMap.put(1,"Hello");
        treeMap.put(6,"JavaEE");
        treeMap.put(2,"World");
        treeMap.put(4,"JavaSE");
        System.out.println(treeMap);
        Set keys = treeMap.keySet();
        Iterator iterator = keys.iterator();
        while (iterator.hasNext()){
            Object key = iterator.next();
            System.out.println(key+"-"+treeMap.get(key));
        }
    }
}
