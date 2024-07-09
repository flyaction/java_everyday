package com.flyaction.demo.study.xianchengdiaodu;

public class JoinRunnable2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0;i<20;i++){

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(i+"------------JoinRunnable2");
        }
    }
}
