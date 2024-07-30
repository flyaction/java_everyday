package com.flyaction.demo.study.duoxiancheng1101;

import java.util.concurrent.*;

/**
 * @author action
 */
public class Test {
    public static void main(String[] args) {
        ExecutorService executorService = null;

        try {
            executorService = new ThreadPoolExecutor(
                    2,
                    3,
                    1L,
                    TimeUnit.SECONDS,
                    new ArrayBlockingQueue<>(2),
                    Executors.defaultThreadFactory(),
                    new ThreadPoolExecutor.CallerRunsPolicy() //new ThreadPoolExecutor.AbortPolicy()
            );

            for(int i = 0;i < 10; i++){
                executorService.execute(()->{
                    try {
                        TimeUnit.MILLISECONDS.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName()+"===>办理业务");
                });
            }


        } catch (Exception e){
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }
    }
}
