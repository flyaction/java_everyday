package com.flyaction.demo.study.file3;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Test4 {
    public static void main(String[] args) throws Exception {
        OutputStream outputStream = new FileOutputStream("/Users/action/code/java_aop/src/main/java/com/flyaction/demo/study/file3/test4.txt");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        String str = "Java是一门面向对象的编程语言，不仅吸收了C++语言的各种优点，还摒弃了C++里难以理解的多继承、指针等概念，因此Java语言具有功能强大和简单易用两个特征。Java语言作为静态面向对象编程语言的代表，极好地实现了面向对象理论，允许程序员以优雅的思维方式进行复杂的编程。";
        byte[] bytes = str.getBytes();
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();

    }
}
