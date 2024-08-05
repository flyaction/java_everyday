package com.flyaction.demo.study.jihe01;

import java.util.Vector;

/**
 * @author action
 */
public class Test2 {
    public static void main(String[] args) {
        Vector vector = new Vector();
        boolean flag = vector.add("java");
        vector.addElement("hello");
        vector.add("world");
        vector.add(1,"ok");
        System.out.println(vector);
    }
}
