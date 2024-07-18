package com.flyaction.demo.study.shengchanxiaofei;

import java.util.concurrent.TimeUnit;

public class Producer {

    private Container container;

    public Producer(Container container) {
        this.container = container;
    }

    public void product(){
        for(int i = 0;i<30;i++){
            Hamburger hamburger = new Hamburger(i);
            this.container.push(hamburger);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
