package com.flyaction.demo.study.jihe05;

import java.util.Iterator;
import java.util.TreeSet;

public class Test2 {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(new Data(1));
        treeSet.add(new Data(3));
        treeSet.add(new Data(6));
        treeSet.add(new Data(2));
        treeSet.add(new Data(5));
        treeSet.add(new Data(4));
        treeSet.add(new Data(1));
        System.out.println("treeSet的长度是："+treeSet.size());
        System.out.println("treeSet遍历：");
        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

class Data implements Comparable{
    private int num;
    public Data(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Data{" +
                "num=" + num +
                '}';
    }

    /**
     * A.compareTo(B)
     * 返回值:
     * 1 表示 A大于B
     * 0 表示 A等于B
     * -1表示 A小于B
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Object o) {
        if(o instanceof Data){
            Data data = (Data) o;
            if(data.num > this.num){
                return -1;
            }else if(data.num == this.num){
                return 0;
            }else{
                return 1;
            }
        }
        return 0;
    }
}
