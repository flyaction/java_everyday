package com.flyaction.demo.study.shengchanxiaofei;

public class Hamburger {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Hamburger{" +
                "id=" + id +
                '}';
    }

    public Hamburger(int id) {
        this.id = id;
    }
}
