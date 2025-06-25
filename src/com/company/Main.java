package com.company;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Anjaan Atma");
        p1.setAge(100);
        System.out.println(p1.getName() + " " + p1.getAge() + " " +p1.Sing());


        Male m1 = new Male();
        m1.setName(" vinay ");
        m1.setAge(23);
        System.out.println(m1.getName() + " " + m1.getAge() + " " + m1.getGender()+" "+m1.Sing());

        Female f1 = new Female();
        f1.setName("chandramukhi laka laka lak");
        f1.setAge(21);
        System.out.println(f1.getName() + " " + f1.getAge() + " " + f1.getGender()+" "+f1.Sing());





    }

}
