package com.flyaction.demo.study.duoxiancheng14;

public class Test {
    public static void main(String[] args) {

        for(int i = 1;i<20; i++){
            System.out.println(i+"个台阶共有"+f(i)+"种走法");
        }
    }

    public static int f(int n){
        if(n == 1) return 1;
        if(n == 2) return 2;
        return f(n-1) + f(n-2);
    }
}
