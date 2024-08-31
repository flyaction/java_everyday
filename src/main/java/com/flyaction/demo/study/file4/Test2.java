package com.flyaction.demo.study.file4;


import com.flyaction.demo.study.file4.entity.User;

import java.io.*;

public class Test2 {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = new FileInputStream("E:\\javaProject\\java_everyday\\src\\main\\java\\com\\flyaction\\demo\\study\\file4\\test5.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        User user =  (User) objectInputStream.readObject();
        System.out.println(user);
        objectInputStream.close();
        inputStream.close();
    }
}
