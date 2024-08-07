package com.flyaction.demo.study.jihe09;

import java.util.Collections;
import java.util.HashSet;

/**
 * @author action
 */
public class Test2 {
    public static void main(String[] args) {
//        ArrayList arrayList = new ArrayList();
//        arrayList.add("Hello");
//        arrayList.add("World");
//        Collections.addAll(arrayList,"JavaSE","JavaME","JavaEE");
//        System.out.println(arrayList);

        HashSet hashSet = new HashSet();
        hashSet.add("Hello");
        hashSet.add("World");
        Collections.addAll(hashSet,"JavaSE","JavaME","JavaEE");
        System.out.println(hashSet);



    }

}



