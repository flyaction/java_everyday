package com.flyaction.demo.study.jicheng;

public class Student extends People{

    private double score;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }


    public Student(){
        System.out.println("通过无参构造创造了student对象");
    }


    public Student(double score){
        System.out.println("通过有参构造创建了student对象");
    }

}
