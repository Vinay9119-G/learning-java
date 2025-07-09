package com.company.topics_withlearning;


import java.util.ArrayList;



public class Main_arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);  // index stsrt from 0
        list.add(5);   // 1
        list.add(80);   // 2
        System.out.println(list.get(1)); // we get the value of 1 which is 5
        System.out.println(list.size()); // size is 3 of whole index
        for (int i = 0; i < list.size(); i++) {   // loop to print the internal values
            System.out.println(list.get(i));
        }
        for (int x : list) {
            System.out.println(x);
        }

        System.out.println(list.contains(5)); // This method says that that is 5 Available in the series or not
        System.out.println(list.contains(50)); // like 50 is not available that why returns false (return only boolean)

//        list.remove(2);   This method removes the inserted index from the list
//        for (int x : list){
//            System.out.println(x);
//        }

//        list.add(2,50);  // Insert the value after the given Index
//        for (int x: list){
//            System.out.println(x);
//        }

        list.set(2,50);
        for (int x : list){
            System.out.println(x);
        }
        //or
        // System.out.println(list);












    }
}
