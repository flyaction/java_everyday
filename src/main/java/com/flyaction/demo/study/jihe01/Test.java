package com.flyaction.demo.study.jihe01;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author action
 */
public class Test {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add("World");
        list.add("JavaSe");
        list.add("JavaMe");
        list.add("JavaEe");
        System.out.println("list:"+list);
        System.out.println("list长度:"+list.size());
        System.out.println("list是否包含java:"+list.contains("java"));
        for (int i =0;i < list.size();i++){
            System.out.println(list.get(i));
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        list.remove("Hello");
        list.remove(0);
        System.out.println("===================");
        System.out.println(list);
        list.add(1,"Spring");
        System.out.println(list);
        list.add(1,"Spring Boot");
        System.out.println(list);
        list.set(1,"Spring Cloud");
        System.out.println(list);
        System.out.println(list.indexOf("Spring"));
        System.out.println(list.subList(1,3));
    }
}
