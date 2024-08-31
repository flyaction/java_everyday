package com.flyaction.demo.study.file4;


import com.flyaction.demo.study.file4.entity.User;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Test {
    public static void main(String[] args) throws Exception {
        User user = new User(1,"张三",22);
        OutputStream outputStream = new FileOutputStream("E:\\javaProject\\java_everyday\\src\\main\\java\\com\\flyaction\\demo\\study\\file4\\test5.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(user);
        objectOutputStream.flush();
        objectOutputStream.close();
        outputStream.close();

    }
}
