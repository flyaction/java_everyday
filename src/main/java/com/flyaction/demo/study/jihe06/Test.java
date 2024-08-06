package com.flyaction.demo.study.jihe06;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("h","Hello");
        hashMap.put("w","World");
        hashMap.put("j","Java");
        hashMap.put("s","JavaSE");
        hashMap.put("m","JavaME");
        hashMap.put("e","JavaEE");
        System.out.println(hashMap);
        hashMap.remove("e");
        System.out.println("删除之后："+hashMap);
        hashMap.put("m","Model");
        System.out.println("添加之后:"+hashMap);
        if(hashMap.containsKey("a")){
            System.out.println("集合中存在key=a");
        }else{
            System.out.println("集合中不存在key=a");
        }
        if(hashMap.containsValue("Java")){
            System.out.println("集合中存在value=Java");
        }else{
            System.out.println("集合中不存在value=Java");
        }
        Set keys = hashMap.keySet();
        System.out.println("集合中的key");
        Iterator iterator = keys.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        Collection values = hashMap.values();
        for (Object value:values){
            System.out.println(value);
        }
        System.out.println("**********************");
        iterator = keys.iterator();
        while (iterator.hasNext()){
            String key = (String) iterator.next();
            String value = (String) hashMap.get(key);
            System.out.println(key+"-"+value);
        }

    }
}
