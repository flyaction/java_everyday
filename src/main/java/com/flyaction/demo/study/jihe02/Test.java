package com.flyaction.demo.study.jihe02;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Stack stack = new Stack();
        //入栈
        stack.push("Hello");
        stack.push("JavaSE");
        stack.push("JavaME");
        stack.push("JavaEE");
        System.out.println(stack);
        for(int i =0;i< stack.size();i++){
            System.out.println(stack.get(i));
        }
        //peek取出栈顶元素
        System.out.println("栈顶元素:"+stack.peek());
        stack.pop();
        System.out.println(stack);
    }
}
