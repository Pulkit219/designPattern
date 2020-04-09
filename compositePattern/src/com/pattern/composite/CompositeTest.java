package com.pattern.composite;

public class CompositeTest {

    public static void main(String[] args) {

        Component hd=new Leaf(100,"HDD");
        Component ram=new Leaf(500,"RAM");

        Composite motherB=new Composite("motherb");
        motherB.addComponent(hd);
        motherB.addComponent(ram);
//        motherB.showPrice();

        hd.showPrice();
    }
}
