package com.flyaction.demo.study.file5;

import java.io.*;

public class Test4 {
    public static void main(String[] args) throws Exception {
        Reader  reader = new FileReader("E:\\javaProject\\java_everyday\\src\\main\\java\\com\\flyaction\\demo\\study\\file5\\1.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        Writer writer = new FileWriter("E:\\javaProject\\java_everyday\\src\\main\\java\\com\\flyaction\\demo\\study\\file5\\4.txt");
       BufferedWriter bufferedWriter = new BufferedWriter(writer);
       String  str = "";
       while ((str = bufferedReader.readLine()) != null){
           bufferedWriter.write(str);
       }
       bufferedWriter.flush();
       bufferedWriter.close();
       bufferedReader.close();
       writer.close();
       reader.close();

    }
}
