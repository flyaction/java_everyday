package com.flyaction.demo.study.cars;

public class Truck extends Car implements Container{

    private int weight;

    public Truck(String name, String color,int weight) {
        super(name, color);
        this.weight = weight;
    }

    @Override
    public String setSeatNum() {
        return "2座";
    }

    @Override
    public int getWeight() {
        return this.weight;
    }
}
