package com.flyaction.demo.study.file3;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class Test {
    public static void main(String[] args) throws Exception {
        //1、创建节点流
        InputStream inputStream = new FileInputStream("/Users/action/code/java_aop/src/main/java/com/flyaction/demo/study/file3/test.txt");
        //2、创建缓冲流
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
//        int temp = 0;
//        while ((temp = bufferedInputStream.read()) != -1){
//            System.out.println(temp);
//        }
        byte[] bytes = new byte[1024];
        int length = bufferedInputStream.read(bytes);
        System.out.println(length);
        for(byte aByte:bytes){
            //System.out.println(aByte);
        }
        bufferedInputStream.close();
        inputStream.close();

    }
}
