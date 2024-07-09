package com.flyaction.demo.study.xianchengdiaodu;

/**
 * @author action
 */
public class JoinTest2 {

    public static void main(String[] args) {

        JoinRunnable2 join = new JoinRunnable2();
        Thread thread = new Thread(join);
        thread.start();

        for(int i = 0;i<100;i++){

            if(i == 10){
                try {
                    thread.join(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(i+"main++++++++++++++++");
        }


    }

}
