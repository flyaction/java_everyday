package com.flyaction.demo.study.file2;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;

public class Test {
    public static void main(String[] args) throws Exception {
        //字符流
        Reader reader = new FileReader("/Users/action/code/java_aop/src/main/java/com/flyaction/demo/study/file2/test.txt");
        int temp = 0;
        System.out.println("**********字符流读取*************");
        while ((temp = reader.read()) != -1){
            System.out.println(temp);
        }
        reader.close();

        //字节流
        InputStream inputStream = new FileInputStream("/Users/action/code/java_aop/src/main/java/com/flyaction/demo/study/file2/test.txt");
        temp = 0;
        System.out.println("**********字节流读取**************");
        while ((temp = inputStream.read()) != -1){
            System.out.println(temp);
        }
        inputStream.close();
    }
}
