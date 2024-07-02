package com.flyaction.demo.study.array;

import java.util.Arrays;

public class test03 {

    public static void main(String[] args) {

        int[] array = {96,93,87,80,73,62,13};

        int[] copyArr = Arrays.copyOf(array,3);
        System.out.println(Arrays.toString(copyArr));

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int index = Arrays.binarySearch(array,87);//用的二分查找
        System.out.println(index);

    }

}
