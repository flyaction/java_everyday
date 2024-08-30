package com.flyaction.demo.study.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Test3 {
    public static void main(String[] args) throws Exception {
        File file = new File("/Users/action/code/java_aop/src/main/java/com/flyaction/demo/study/file/test2.txt");
        if(file.exists()){
            //1、创建数组
            byte bytes[] = new byte[(int)file.length()];//0填充
            //2、创建流
            InputStream inputStream = new FileInputStream(file);
            //3、读取流
            int length = inputStream.read(bytes);
            System.out.println(length);

        }


    }
}
