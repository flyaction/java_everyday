package com.flyaction.demo.study.duotai;

public class Cashier {

//    public OrdinaryMember ordinaryMember;
//
//    public OrdinaryMember getOrdinaryMember() {
//        return ordinaryMember;
//    }
//
//    public void setOrdinaryMember(OrdinaryMember ordinaryMember) {
//        this.ordinaryMember = ordinaryMember;
//    }
//
//    public void settlement(){
//        this.ordinaryMember.buyBook();
//    }

    public Member member;

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public void settlement(){
        this.member.buyBook();
    }

}
