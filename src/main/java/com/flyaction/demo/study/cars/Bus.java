package com.flyaction.demo.study.cars;

public class Bus extends Car {
    public Bus(String name, String color) {
        super(name, color);
    }

    @Override
    public String setSeatNum() {
        return "53座";
    }
}
