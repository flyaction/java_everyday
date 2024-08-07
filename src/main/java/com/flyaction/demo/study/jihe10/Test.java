package com.flyaction.demo.study.jihe10;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add("World");
        Collections.addAll(list,"Java","JavaSE","JavaME");
//        System.out.println("排序之前");
//        System.out.println(list);
        //进行排序->升序
//        Collections.sort(list);
//        System.out.println("排序之后");
//        System.out.println(list);
        //查找元素在集合中的下标，二分查找法（集合中的元素必须升序排列）
//        int index = Collections.binarySearch(list,"Hello");
//        System.out.println("Hello在list中的下标:"+index);
//        Collections.replaceAll(list,"Java","Collections");
//        System.out.println(list);
        Collections.addAll(
                list,
                new User(1,"张三",33),
                new User(2,"李四",34),
                new User(3,"王五",35)
        );
        Collections.sort(list);
        System.out.println(list);

    }
}


class User implements Comparable{
    private Integer id;
    private String name;
    private Integer age;

    public User(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof User){
            User user = (User) o;
            if(this.age > user.age){
                return 1;
            }else if(this.age == user.age){
                return 0;
            }else{
               return -1;
            }
        }
        return 0;
    }
}
