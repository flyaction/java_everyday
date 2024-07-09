package com.flyaction.demo.study.xianchengdiaodu;

public class MyThread extends Thread{

    @Override
    public void run() {

        for (int i =0;i<10;i++){

            if(i == 5){
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            System.out.println(i+"---------------MyThread");

        }

    }
}
