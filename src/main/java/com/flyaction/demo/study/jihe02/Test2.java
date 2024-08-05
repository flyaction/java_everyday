package com.flyaction.demo.study.jihe02;

import java.util.LinkedList;

/**
 * @author action
 */
public class Test2 {
    public static void main(String[] args) {
        LinkedList linkedList =  new LinkedList();
        linkedList.add("Hello");
        linkedList.add("World");
        linkedList.add("Java");
        System.out.println(linkedList);
        linkedList.offer("JavaSE");
        System.out.println(linkedList);
        linkedList.push("JavaME");//插入头部
        System.out.println(linkedList);
        linkedList.addFirst("First");//插入头部
        System.out.println(linkedList);
        linkedList.addLast("Last");
        System.out.println(linkedList);
        System.out.println(linkedList.peek());
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        System.out.println(linkedList.pop());
        System.out.println(linkedList);
    }
}
