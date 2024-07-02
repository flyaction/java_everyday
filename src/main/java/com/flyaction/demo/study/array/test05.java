package com.flyaction.demo.study.array;

import java.util.Arrays;

public class test05 {

    public static void main(String[] args) {

        int[] array = {1,2,3};

        //数组扩容
        array = Arrays.copyOf(array,4);

        array[3] = 4;

        System.out.println(Arrays.toString(array));




    }

}
