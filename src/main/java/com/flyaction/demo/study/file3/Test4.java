package com.flyaction.demo.study.file3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class Test4 {
    public static void main(String[] args) throws Exception {
        Reader reader = new FileReader("/Users/action/code/java_aop/src/main/java/com/flyaction/demo/study/file3/test.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        char[] chars = new char[1024];
        int length = bufferedReader.read(chars);
        System.out.println(length);
        for (char aChar:chars){
            System.out.println(aChar);
        }
        bufferedReader.close();
        reader.close();


    }
}
