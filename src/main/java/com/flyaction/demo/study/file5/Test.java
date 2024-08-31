package com.flyaction.demo.study.file5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Test {
    public static void main(String[] args) throws Exception {
        //1、通过输入流将文件读入到java
        InputStream inputStream = new FileInputStream("E:\\javaProject\\java_everyday\\src\\main\\java\\com\\flyaction\\demo\\study\\file5\\1.jpg");
        //2、通过输出流将文件从java写入到myjava
        OutputStream outputStream  = new FileOutputStream("E:\\javaProject\\java_everyday\\src\\main\\java\\com\\flyaction\\demo\\study\\file5\\2.jpg");
        int temp = 0;
        while ((temp = inputStream.read()) != -1){
            //System.out.println(temp);
            outputStream.write(temp);
        }
        outputStream.flush();
        outputStream.close();
        inputStream.close();



    }
}
