package com.flyaction.demo.study.cars;

public class Sedan extends Car {

    public Sedan(String name, String color) {
        super(name, color);
    }

    @Override
    public String setSeatNum() {
        return "4座";
    }

}
