package com.flyaction.demo.study.duoxiancheng;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author action
 */
public class Test {
    public static void main(String[] args) {

        MyCallable myCallable = new MyCallable();
        FutureTask<String> futureTask = new FutureTask(myCallable);
        Thread thread = new Thread(futureTask);
        thread.start();
        try {
            String value = futureTask.get();
            System.out.println(value);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

    }
}

class MyCallable implements Callable<String>{

    @Override
    public String call() throws Exception {
        System.out.println("callable");
        return "hello";
    }
}
