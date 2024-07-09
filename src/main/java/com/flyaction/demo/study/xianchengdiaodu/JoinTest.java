package com.flyaction.demo.study.xianchengdiaodu;

/**
 * @author action
 */
public class JoinTest{

    public static void main(String[] args) {

        /**
         * 两个线程，主线程、join线程
         * 主线程的逻辑：i==10,join线程合并到主线程中
         */
        JoinRunnable joinRunnable = new JoinRunnable();
        Thread thread = new Thread(joinRunnable);
        thread.start();

        for(int i = 0;i<100;i++){

            if(i == 10){
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(i+"main++++++++++++++++");
        }


    }

}
