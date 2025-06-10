package com.company;

import java.util.Scanner;

public class cwh_14_stringmethods {
    public static void main(String[] args) {

//      String  methods

//        1. name.length
          String name = "vinay";
          int value = name.length();
          System.out.println(value);

//         2. name.tolowercase
//     String lstring = friend.toLowerCase();
//        System.out.println(lstring);

  //      3. name.touppercase
//        String ustring = friend.toUpperCase();
//        System.out.println(ustring);

//        4. name.trim
//      String nonTrimmedString = "    vinay   ";
//        System.out.println(nonTrimmedString);
//
//        String trimmedString = nonTrimmedString.trim();
//        System.out.println(trimmedString);

//        5.   name.Substring(int start)
        System.out.println(name.substring(1));

//        6.   name.Substring(int start,int end)
        System.out.println(name.substring(1,4));

//        7.  name.replace("a","n")
        System.out.println(name.replace("a","y"));
        System.out.println(name.replace("ay","ny"));

//        8. name.startswith("vi")
        System.out.println(name.startsWith("vi"));

//        9.  name.endswith("ay")
        System.out.println(name.endsWith("nay"));

//        10.  name.charAt(2)
        System.out.println(name.charAt(4));



//    ;    11.  name.indexof(5)
        System.out.println(name.indexOf("na"));


  //        String modifiedname = "vinaynay";
//        System.out.println(modifiedname.indexOf("nay"));
//        12.  name.indexof("s",3)
   //     System.out.println(modifiedname.indexOf("nay",4));

//        13. name.lastnameof("s")
 //       System.out.println(modifiedname.lastIndexOf("na"));

//        14. name.lastindexof("s",3)
//        System.out.println(modifiedname.lastindexof("nay",3));

//        15. name.equals("vinay")
//        System.out.println(name.equals("vinay"));

//        16. name.equalsIgnoreCase("vinay")
//        System.out.println(name.equalsIgnoreCase("vINAY"));


//        System.out.println("the don is the don \\  don boy");

    }
}
