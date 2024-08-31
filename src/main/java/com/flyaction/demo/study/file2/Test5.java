package com.flyaction.demo.study.file2;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test5 {
    public static void main(String[] args) throws Exception{
        //基础管道
        InputStream inputStream = new FileInputStream("/Users/action/code/java_aop/src/main/java/com/flyaction/demo/study/file2/test2.txt");
        //处理流
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        char[] chars = new char[1024];
        int length = inputStreamReader.read(chars);
        inputStreamReader.close();
        String result = new String(chars,0,length);
        System.out.println(result);
    }
}
