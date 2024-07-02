package com.flyaction.demo.study.array;

import java.util.Arrays;

public class test04 {

    public static void main(String[] args) {

        int[][] array;
        array = new int[2][3];
        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;
        array[1][0] = 4;
        array[1][1] = 5;
        array[1][2] = 6;

        System.out.println(Arrays.toString(array));

        System.out.println(Arrays.toString(array[0]));


    }

}
