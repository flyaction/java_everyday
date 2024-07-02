package com.flyaction.demo.study.object;

public class Test02 {

    public static int id;

    public void show(){

        int id = 1;

        System.out.println(id);
    }

    public static void main(String[] args) {

        Test02 test = null;

        for(int i = 0;i< 10;i++){
            test = new Test02();
            test.id++;
        }

        System.out.println(test.id);
    }

    static {
        System.out.println(123);

    }


}
