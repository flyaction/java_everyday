package com.flyaction.demo.study.array;

import java.util.Arrays;

public class test02 {

    public static void main(String[] args) {

        int[] array = {96,93,87,80,73,62,13};

        int temp;

        for (int i = 0;i<array.length-1;i++){

            for (int j = 0;j < array.length-1-i;j++){
                if(array[j] > array[j+1]){

                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;

                }
            }

        }

        System.out.println(Arrays.toString(array));

    }

}
