package com.flyaction.demo.study.jihe4;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test2 {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Data data1 = new Data(1);
        linkedHashSet.add(data1);
        Data data2 = new Data(1);
        linkedHashSet.add(data2);

        System.out.println(data1.equals(data2));

        Iterator iterator = linkedHashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}

class Data{
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

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        //instanceof 判断对象是否属于某个类
        if(obj instanceof Data){
            Data data = (Data) obj;
            if(data.num == this.num){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
