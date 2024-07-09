package com.flyaction.demo.study.xianchengdiaodu;

/**
 * @author action
 */
public class Test2 {

    public static void main(String[] args) {

        for(int i =0;i<10;i++){
            if(i == 5){
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(i+"+++++++++++Test2+++++++++");
        }


    }

}
