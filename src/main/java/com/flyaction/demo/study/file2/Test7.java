package com.flyaction.demo.study.file2;

import java.io.*;

public class Test7 {
    public static void main(String[] args) throws Exception{
        File file = null;
        //节点流
        InputStream inputStream = new FileInputStream(file);
        OutputStream outputStream = new FileOutputStream(file);

        Reader reader = new FileReader(file);
        Writer writer = new FileWriter(file);

        //处理流
        //InputStreamReader inputStreamReader = new InputStreamReader(file);
        //OutputStreamWriter outputStreamWriter = new OutputStreamWriter(file);

    }
}
