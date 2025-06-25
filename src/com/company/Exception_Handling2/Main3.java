package com.company.Exception_Handling2;

import java.util.Scanner;

public class Main3 {

        public static void main(String[] args) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter your Age:");
                int age = sc.nextInt();
                System.out.println("your age is, " + age);
            } catch (Exception error) {
                System.out.println("Error: " + error);
            } finally {
                System.out.println("inside Finally -> muje matlb nhi hai, error ho ya na ho");
            }

        }

        // public static void main(String[] args) {
        // 			Scanner sc = new Scanner(System.in);
        // 			System.out.println("Enter your Age:");
        // 			int age = sc.nextInt();
        // 			System.out.println("your age is, " + age);


        //           System.out.println("Pradhumn");
//            }
//    }

}
