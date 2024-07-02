package com.flyaction.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloApplication {

	public static void main(String[] args) {

		//声明数组
		int[] array;
		array = new int[6];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		array[4] = 5;
		array[5] = 6;

		int[] array2 = new int[]{1,2,3,4,5,6};

		int[] array3 = {1,2,3,4,5,6};


		System.out.println(array);
	}

}
