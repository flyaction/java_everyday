package com.flyaction.demo.study.jiekouexercise;

/**
 * @author action
 */
public class Test {

    public static void main(String[] args) {

        Factory factory = new Factory();
        Equipment equipmentA = new EquipmentA();

        factory.setEquipment(equipmentA);
        factory.work();




    }

}
