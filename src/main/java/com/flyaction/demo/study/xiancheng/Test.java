package com.flyaction.demo.study.xiancheng;

public class Test {

    public static void main(String[] args) {

        //匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0;i<10;i++){
                    System.out.println("--------------11111111111");
                }

            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {

                for(int i=0;i<10;i++){
                    System.out.println("-------------2222222222");
                }

            }
        }).start();


        for(int i = 0;i<10;i++){
            System.out.println("--------------3333333333");
        }



    }


}
