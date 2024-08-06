package com.flyaction.demo.study.jihe07;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
        hashtable.put("h","Hello");
        hashtable.put("w","World");
        hashtable.put("j","Java");
        hashtable.put("s","JavaSE");
        hashtable.put("m","JavaME");
        hashtable.put("e","JavaEE");
        System.out.println(hashtable);
        hashtable.remove("e");
        System.out.println(hashtable);
        System.out.println(hashtable.contains("a"));
        System.out.println(hashtable.containsValue("Java"));
        Set keys = hashtable.keySet();
        System.out.println(keys);
        Collection values = hashtable.values();
        System.out.println(values);
    }
}
