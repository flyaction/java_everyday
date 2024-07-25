package com.flyaction.demo.study.duoxiancheng8;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @author action
 */
public class SemaphoreTest {
    public static void main(String[] args) {
        //初始化
        Semaphore semaphore = new Semaphore(5);

        for(int i = 0; i < 15; i++){
            new Thread(()->{
                //获得许可
                try {
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName()+"进店购物");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println(Thread.currentThread().getName()+"出店");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } finally {
                    //释放
                    semaphore.release();
                }
            },String.valueOf(i)).start();
        }
    }
}
