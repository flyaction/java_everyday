package com.flyaction.demo.study.array;

import java.util.Arrays;

public class test01 {

    public static void main(String[] args) {

        int[] array = {96,93,87,80,73,62};

        int[] array2 = new int[array.length+1];

        for (int i = 0;i<array2.length;i++){

            if(i < 3){
                array2[i] = array[i];
            }else if(i == 3){
                array2[3] = 83;
            }else{
                array2[i] = array[i-1];
            }
        }

        System.out.println(Arrays.toString(array2));

    }

}
