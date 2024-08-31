package com.flyaction.demo.study.file3;

import java.io.*;

public class Test5 {
    public static void main(String[] args) throws Exception {
        Writer writer = new FileWriter("/Users/action/code/java_aop/src/main/java/com/flyaction/demo/study/file3/test5.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
//        String str = "Java是一门面向对象的编程语言，不仅吸收了C++语言的各种优点，还摒弃了C++里难以理解的多继承、指针等概念，因此Java语言具有功能强大和简单易用两个特征。Java语言作为静态面向对象编程语言的代表，极好地实现了面向对象理论，允许程序员以优雅的思维方式进行复杂的编程。";
//        bufferedWriter.write(str);
//        char[] chars = {'J','a','v','a'};
//        bufferedWriter.write(chars);

        bufferedWriter.write(22909);

        bufferedWriter.flush();
        bufferedWriter.close();
        writer.close();
    }
}
