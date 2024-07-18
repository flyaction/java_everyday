package com.flyaction.demo.study.shengchanxiaofei;

import java.util.concurrent.TimeUnit;

public class Consumer {

    private Container container;

    public Consumer(Container container) {
        this.container = container;
    }

    public void consum(){
        for(int i = 0;i<30;i++){
            this.container.pop();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
