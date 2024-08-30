package com.flyaction.demo.study.file2;

import java.io.FileReader;
import java.io.Reader;

public class Test2 {
    public static void main(String[] args) throws Exception {
        Reader reader = new FileReader("/Users/action/code/java_aop/src/main/java/com/flyaction/demo/study/file2/test.txt");
        char[] chars = new char[8];
        int length = reader.read(chars);
        System.out.println("数据流的长度是"+length);
        System.out.println("遍历数组");
        for(char aChar:chars){
            System.out.println(aChar);
        }
    }
}
