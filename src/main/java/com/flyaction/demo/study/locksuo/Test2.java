package com.flyaction.demo.study.locksuo;

public class Test2 {

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0;i<100;i++){
                    System.out.println("+++++++++++Runnable");
                }
            }
        });
        thread.start();

    }

}
