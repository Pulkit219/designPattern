package com.pattern.composite;


import java.util.*;

interface Component{
     void showPrice();
}



 class Leaf implements Component{
    int price;
    String name;

     public Leaf(int price, String name) {
         this.price = price;
         this.name = name;
     }

     @Override
     public void showPrice() {
         System.out.println(this.name +" "+this.price);
     }

     public void  test(){
         System.out.println("test");
     }
 }


 class Composite implements Component {

     String name;
     public Composite(String name) {
         this.name = name;
     }


    List<Component> compList=new ArrayList<>();

    public void addComponent(Component l){
        compList.add(l);
    }
     @Override
     public void showPrice() {
         System.out.println(this.name);
         for(Component c:compList){
             c.showPrice();
         }
     }

}