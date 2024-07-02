package com.flyaction.demo.study.duotai;

public class Test01 {

    public static void main(String[] args) {

        Student student = new Student(99.0);

        Student student2 = new Student(99.0);

        if(student.getScore() == student2.getScore()){
            System.out.println(1);
        }else{
            System.out.println(2);
        }



    }

}
