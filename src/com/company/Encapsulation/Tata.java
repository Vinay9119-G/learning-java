package com.company.Encapsulation;

public class Tata {
    public static void main(String[] args) {
        Suv s1 = new Suv();
        s1.setName("Harrier");
        s1.setFeatures("6 Airbags, power window , diesel engine");
        System.out.println(s1.getName()+"  "+s1.getFeatures()+"  "+s1.getModel());
    }
}
