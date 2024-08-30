package com.flyaction.demo.study.file;

import java.io.File;
import java.io.FileInputStream;

public class Test2 {
    public static void main(String[] args) throws Exception {
        File file = new File("/Users/action/code/java_aop/src/main/java/com/flyaction/demo/study/file/test2.txt");
        if(file.exists()){
            FileInputStream inputStream = new FileInputStream(file);
//            long length = file.length();
//            for(int i =0;i<length;i++){
//                System.out.println(inputStream.read());
//            }
            int temp = 0;
            while ((temp = inputStream.read()) != -1){
                System.out.println("当前读取到的数据是"+temp+",当前未读取到数据格式是"+inputStream.available());
            }
        }


    }
}
