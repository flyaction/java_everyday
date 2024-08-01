package com.flyaction.demo.study.duoxiancheng13;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            new Thread(()->{
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                list.add("a");
            }).start();

        }


    }
}
