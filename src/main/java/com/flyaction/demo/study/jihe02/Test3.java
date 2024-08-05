package com.flyaction.demo.study.jihe02;

import java.util.PriorityQueue;

/**
 * @author action
 */
public class Test3 {
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue();
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        queue.add("a");
//        queue.add("b");
//        queue.add("c");
        //Queue中添加的数据必须是有顺序的
        queue.add(new A(1));
        queue.add(new A(2));
        System.out.println(queue);
    }
}

class A implements Comparable{
    private int num;

    public A(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "A{" +
                "num=" + num +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        A a = (A)o;
        if(this.num > a.num){
            return 1;
        }else if(this.num == a.num){
            return 0;
        }else{
            return -1;
        }
    }
}