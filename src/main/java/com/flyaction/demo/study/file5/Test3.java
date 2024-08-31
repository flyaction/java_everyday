package com.flyaction.demo.study.file5;

import java.io.*;

public class Test3 {
    public static void main(String[] args) throws Exception {
        Reader  reader = new FileReader("E:\\javaProject\\java_everyday\\src\\main\\java\\com\\flyaction\\demo\\study\\file5\\1.txt");
        Writer writer  = new FileWriter("E:\\javaProject\\java_everyday\\src\\main\\java\\com\\flyaction\\demo\\study\\file5\\22.txt");
        int temp = 0;
        while ((temp = reader.read()) != -1){
            writer.write(temp);
        }
        writer.flush();
        writer.close();
        reader.close();
    }
}
