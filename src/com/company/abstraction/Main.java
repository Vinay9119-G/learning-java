package com.company.abstraction;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Sweety");
        cat.setAge(2);
        Dog dog = new Dog();
        dog.setName("oreo");
        dog.setAge(5);

        cat.sayHello();
//        cat.sleep();
        dog.sayHello();
//        dog.sleep();

        System.out.println("cat age is :" + cat.getAge()+" "+"and"+"cat name is :" +cat.getName());
        System.out.println("Dog age is :" + dog.getAge()+" "+"and"+ "Dog name is :" + dog.getName() );


    }
}
