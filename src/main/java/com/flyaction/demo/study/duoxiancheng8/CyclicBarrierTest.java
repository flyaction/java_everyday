package com.flyaction.demo.study.duoxiancheng8;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(10,()->{
            System.out.println("放行");
        });

        for(int i = 0;i<10;i++){
            final int temp = i;
            new Thread(()->{
                System.out.println("------>"+temp);
                try {
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } catch (BrokenBarrierException e) {
                    throw new RuntimeException(e);
                }
            }).start();
        }

    }
}
