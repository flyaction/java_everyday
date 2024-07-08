package com.flyaction.demo.study.xiancheng;

public class MyThread  extends  Thread{

    @Override
    public void run() {
        //super.run();

        for(int i = 0;i<100;i++){
            System.out.println("--------------MyThread");
        }

    }
}
