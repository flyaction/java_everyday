package com.flyaction.demo.study.file;

import java.io.*;

public class Test5 {
    public static void main(String[] args) throws Exception {

        OutputStream outputStream = new FileOutputStream("/Users/action/code/java_aop/src/main/java/com/flyaction/demo/study/file/test3.txt");
        //outputStream.write(108);
        byte bytes[] = {105,111,99,100,98,66,78,90};
        outputStream.write(bytes);
        outputStream.flush();
        outputStream.close();


    }
}
