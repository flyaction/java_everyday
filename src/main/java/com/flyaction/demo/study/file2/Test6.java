package com.flyaction.demo.study.file2;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Test6 {
    public static void main(String[] args) throws Exception{
        String str = "你好 世界";
        OutputStream outputStream  = new FileOutputStream("/Users/action/code/java_aop/src/main/java/com/flyaction/demo/study/file2/test6.txt");
        OutputStreamWriter writer = new OutputStreamWriter(outputStream);
        writer.write(str);
        writer.flush();
        writer.close();
    }
}
