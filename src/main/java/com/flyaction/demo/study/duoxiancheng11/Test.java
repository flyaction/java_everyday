package com.flyaction.demo.study.duoxiancheng11;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author action
 *
 *
 * 线程池
 */
public class Test {
    public static void main(String[] args) {
        //单例
        //ExecutorService executorService = Executors.newSingleThreadExecutor();
        //指定线程数量
        //ExecutorService executorService = Executors.newFixedThreadPool(5);
        //缓冲线程池
        ExecutorService executorService = Executors.newCachedThreadPool();
        for(int i = 0;i<10;i++){
            final int temp = i;
            executorService.execute(()->{
                System.out.println(Thread.currentThread().getName()+"----"+temp);
            });
        }
        executorService.shutdown();
    }
}
