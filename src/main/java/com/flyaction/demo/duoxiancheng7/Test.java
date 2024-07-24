package com.flyaction.demo.duoxiancheng7;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        //1、使用 Vector,add方法线程安全
        //List<String> list = new Vector<>();

        //2、Collections.synchronizedList
        //List<String> list = Collections.synchronizedList(new ArrayList<>());

        //3、CopyOnWriteArrayList
        // 写时复制，当我们往一个容器添加元素的时候，不是直接给容器添加，而是先将当前容器复制一份，向新的容器中添加数据，添加完成之后，再降原容器的引用指向新的容器。
        List<String> list = new CopyOnWriteArrayList<>();


        for(int i = 0;i<10;i++){
            new Thread(()->{
                try {
                    TimeUnit.MICROSECONDS.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                //写
                list.add("a");
                //读
                System.out.println(list);
            },String.valueOf(i)).start();
        }

    }
}
