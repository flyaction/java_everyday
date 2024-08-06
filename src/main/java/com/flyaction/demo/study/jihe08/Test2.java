package com.flyaction.demo.study.jihe08;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Test2 {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap();
        treeMap.put(new User(3,"Java"),"Java");
        treeMap.put(new User(5,"JavaME"),"JavaME");
        treeMap.put(new User(1,"Hello"),"Hello");
        treeMap.put(new User(6,"JavaEE"),"JavaEE");
        treeMap.put(new User(2,"World"),"World");
        treeMap.put(new User(4,"JavaSE"),"JavaSE");
        System.out.println(treeMap);
        Set set = treeMap.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Object key = iterator.next();
            System.out.println(key+"-"+treeMap.get(key));
        }
    }
}
class User implements Comparable{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof User){
           User user = (User) o;
           if(this.id > user.id){
                return 1;
           }else if(this.id == user.id){
               return 0;
            }else{
               return -1;
           }
        }
        return 0;
    }
}
