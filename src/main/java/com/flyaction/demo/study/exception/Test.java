package com.flyaction.demo.study.exception;

public class Test {

    public static void main(String[] args) throws MyNumberException {

        Test test = new Test();
        System.out.println(test.add(1));

    }


    public int add(Object object) throws MyNumberException {

        if(object instanceof Integer){
            int num = (int)object;
             return ++num;
        }else{
            String message = "传入的参数不是整数类型";
            MyNumberException myNumberException = new MyNumberException(message);
            throw myNumberException;

        }

    }

}
