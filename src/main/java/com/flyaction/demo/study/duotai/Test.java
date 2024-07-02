package com.flyaction.demo.study.duotai;

public class Test {

    public static void main(String[] args) {

        OrdinaryMember ordinaryMember = new OrdinaryMember();

        SuperMember superMember = new SuperMember();

        Cashier cashier = new Cashier();

        cashier.setMember(superMember);

        cashier.settlement();


    }



}
