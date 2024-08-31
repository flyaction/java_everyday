package com.flyaction.demo.study.file3;

import java.io.FileReader;
import java.io.Reader;

public class Test3 {
    public static void main(String[] args) throws Exception {
        Reader reader = new FileReader("/Users/action/code/java_aop/src/main/java/com/flyaction/demo/study/file3/test.txt");
        int temp = 0;
        int num = 0;
        System.out.println("******START*********");
        while ((temp = reader.read())!= -1){
            System.out.println(temp);
            num++;
        }
        System.out.println("******end***********,共读取"+num+"次");
        reader.close();


    }
}
