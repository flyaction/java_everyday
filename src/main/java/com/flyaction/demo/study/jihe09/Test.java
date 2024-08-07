package com.flyaction.demo.study.jihe09;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author action
 */
public class Test {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Hello");
        arrayList.add("World");
        System.out.println("添加之前的集合："+arrayList);
        boolean flag = Collections.addAll(arrayList,"JavaSE","JavaME","JavaEE");
        System.out.println("添加之后的集合："+arrayList);
        Collections.reverse(arrayList);
        System.out.println("翻转之后的集合："+arrayList);
        Collections.swap(arrayList,1,4);
        System.out.println("调换位置之后的集合:"+arrayList);


    }

    public static void test(int... arg){
        System.out.println(arg);
    }
}

class Data extends Object{

}



