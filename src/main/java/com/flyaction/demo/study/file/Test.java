package com.flyaction.demo.study.file;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        File file = new File("/Users/action/code/java_aop/src/main/java/com/flyaction/demo/study/file/test.txt");
        System.out.println(file.exists());
//        file.delete();
        //file.renameTo(new File("/Users/action/code/java_aop/src/main/java/com/flyaction/demo/study/file/test2.txt"));


    }
}
