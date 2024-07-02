package com.flyaction.demo.study.baozhuang;

public class test01 {

    public static void main(String[] args) {

        Byte byt = Byte.valueOf("1");
        Short shot = Short.valueOf("2");
        Integer integer = Integer.valueOf("3");
        Long lon = Long.valueOf("4");
        Float flo = Float.valueOf("5.5f");
        Double dou = Double.valueOf("6.6");
        Boolean boo = Boolean.valueOf("true");
        Character cha = Character.valueOf('J');

        byte  b = byt.byteValue();
        short s = shot.shortValue();
        int i = integer.intValue();
        long l = lon.longValue();
        float f = flo.floatValue();
        double d = dou.doubleValue();
        boolean bo = boo.booleanValue();
        char c = cha.charValue();



        System.out.println(byt);

    }

}
