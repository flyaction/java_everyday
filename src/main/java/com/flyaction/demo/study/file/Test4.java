package com.flyaction.demo.study.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Test4 {
    public static void main(String[] args) throws Exception {
        File file = new File("/Users/action/code/java_aop/src/main/java/com/flyaction/demo/study/file/test2.txt");
        if(file.exists()){
            InputStream inputStream = new FileInputStream(file);
            byte[]  bytes = inputStream.readAllBytes();
            int i = 0;
            inputStream.close();
        }


    }
}
