package com.flyaction.demo.study.file5;

import java.io.*;

public class Test5 {
    public static void main(String[] args) throws Exception {
        Reader  reader = new FileReader("E:\\javaProject\\java_everyday\\src\\main\\java\\com\\flyaction\\demo\\study\\file5\\1.jpg");
        BufferedReader bufferedReader = new BufferedReader(reader);
        Writer writer = new FileWriter("E:\\javaProject\\java_everyday\\src\\main\\java\\com\\flyaction\\demo\\study\\file5\\5.jpg");
       BufferedWriter bufferedWriter = new BufferedWriter(writer);
       long start = System.currentTimeMillis();
       String  str = "";
       while ((str = bufferedReader.readLine()) != null){
           bufferedWriter.write(str);
       }
       long end  = System.currentTimeMillis();
        System.out.println("传输完毕，共耗时"+(end-start));
       bufferedWriter.flush();
       bufferedWriter.close();
       bufferedReader.close();
       writer.close();
       reader.close();

    }
}
