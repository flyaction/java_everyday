package com.flyaction.demo.study.locksuo2;

import java.util.concurrent.TimeUnit;

public class Test {

    public static void main(String[] args) {
        System.out.println(1);
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(2);
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(3);
    }

}
