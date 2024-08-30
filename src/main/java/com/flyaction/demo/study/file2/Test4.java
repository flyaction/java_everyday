package com.flyaction.demo.study.file2;

import java.io.FileWriter;
import java.io.Writer;

public class Test4 {
    public static void main(String[] args) throws Exception{
        Writer writer = new FileWriter("/Users/action/code/java_aop/src/main/java/com/flyaction/demo/study/file2/test2.txt");
        //writer.write("HelloWorld");
//        char[] chars = {'你','好','世','界'};
//        writer.write(chars);
        String str = "Hello World,你好世界";
        writer.write(str,10,6);
        writer.flush();
        writer.close();
    }
}
