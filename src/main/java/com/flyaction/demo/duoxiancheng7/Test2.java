package com.flyaction.demo.duoxiancheng7;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class Test2 {
    public static void main(String[] args) {

        Map<String,String> map = new ConcurrentHashMap<>();

        for(int i = 0;i<10;i++){
            final int temp = i;
            new Thread(()->{
                try {
                    TimeUnit.MICROSECONDS.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                //写
               map.put(UUID.randomUUID().toString().substring(0,3),UUID.randomUUID().toString().substring(0,2));
                //读
                System.out.println(map);
            },String.valueOf(i)).start();
        }

    }
}
