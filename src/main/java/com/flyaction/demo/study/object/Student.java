package com.flyaction.demo.study.object;

public class Student {


    public static int id;
    public int num;

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Student.id = id;
    }

    static {
        id++;
        System.out.println(id);
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String name;

    //不需要定义返回类型
    public Student(){
        System.out.println("调用了student无参构造方法");
    }

    public Student(int num,String name){

        this.num = num;
        this.name = name;

        System.out.println("调用了student构造方法,num:"+num+",name:"+name);
    }

    public static void main(String[] args) {

        System.out.println("main方法");

    }


}
