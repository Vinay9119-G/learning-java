package com.company.topics_withlearning;

import java.util.ArrayList;
import java.util.List;

// This method is for String which sort the words according to its length
//class  StringLengthComparator  implements  Comparator<String>{
//
//    @Override
//    public int compare (String s1, String s2){
//        return s2.length() - s1.length();
//
//    }
//
//}

// This is for the integer which helps to sort in Ascending or descending order
//class MyComparator implements Comparator<Integer>{
//
//    @Override
//    public int compare(Integer o1, Integer o2){
//        return o2 - o1;
//    }
//}

class Student {
    private String name;
    private double gpa;

    public Student(String name , double gpa){
        this.name = name;
        this.gpa = gpa;
    }
    public  String getName(){return  name; }
    public double getGpa() {return gpa; }

}






 public class Comparator {
    public static void main(String[] args) {

        List <Student> Students = new ArrayList<>();
        Students.add(new Student("Alice",3.7));
        Students.add(new Student("Vinay",3.6));
        Students.add(new Student("Bob",3.5));
        Students.add(new Student("Piyush",3.9));
        Students.add(new Student("Moksh",3.2));

//        Students.sort((a,b) -> (int) (b.getGpa() - a.getGpa()));
        Students.sort((o1,o2) -> {
           if (o2.getGpa() -o1.getGpa() > 0){
               return 1;
           } else if (o2.getGpa() - o1.getGpa() < 0) {
               return -1;
           }else {
               return 0;
           }
        });
//         if we want to

        for (Student s : Students ){
            System.out.println(s.getName() + " : " + s.getGpa());
        }









//        Lambda expression

//        List<String> words = Arrays.asList("Banana","Apple","Date","Carrot");
//        words.sort((a,b)  -> a.length() - b.length());
//        System.out.println(words);

//        List<Integer> list = new ArrayList<>();
//        list.add(2);
//        list.add(1);
//        list.add(3);
//        list.add(5);
//        list.add(4);
//        list.add(9);
//        list.add(6);
//        list.add(11);
//        list.add(10);
//        list.add(7);
//        list.add(8);
//        list.add(12);
//
//        list.sort(new MyComparator());
//        System.out.println(list);
//
//
//
//        List<String> words = Arrays.asList("Banana","Apple","Date","Carrot");
//        words.sort(new StringLengthComparator());
//        System.out.println(words);






    }
}
