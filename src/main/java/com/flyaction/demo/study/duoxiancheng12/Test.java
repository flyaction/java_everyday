package com.flyaction.demo.study.duoxiancheng12;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

/**
 * ForkJoinTask
 */
public class Test {
    public static void main(String[] args) {
        Long startTime = System.currentTimeMillis();
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        ForkJoinTask<Long> task = new ForkJoinDemo(0L,10_0000_0000L);
        forkJoinPool.execute(task);
        Long sum = 0L;
        try {
            sum = task.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println(sum+",共耗时"+(endTime-startTime));
    }
}
