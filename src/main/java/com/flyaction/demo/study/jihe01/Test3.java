package com.flyaction.demo.study.jihe01;

import java.util.Vector;
import java.util.concurrent.TimeUnit;

/**
 * @author action
 */
public class Test3 {
    public static void main(String[] args) {

        //ArrayList list = new ArrayList();

        Vector list = new Vector();

        for(int i =0;i<10;i++){

            final int temp = i;
            new Thread(()->{
                try {
                    TimeUnit.MILLISECONDS.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                list.add(String.valueOf(temp));
                System.out.println(list);
            }).start();


        }


    }
}
