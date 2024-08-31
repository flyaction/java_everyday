package com.flyaction.demo.study.file3;

import java.io.*;

public class Test2 {
    public static void main(String[] args) throws Exception {
        //1、创建字符流（节点流）
        Reader reader = new FileReader("/Users/action/code/java_aop/src/main/java/com/flyaction/demo/study/file3/test.txt");
        //2、创建缓冲流（处理流）
        BufferedReader bufferedReader = new BufferedReader(reader);
        String str = null;
        int num = 0;
        System.out.println("******START*********");
        while ((str = bufferedReader.readLine()) != null){
            System.out.println(str);
            num++;
        }
        System.out.println("******end***********,共读取"+num+"次");

        bufferedReader.close();
        reader.close();

    }
}
