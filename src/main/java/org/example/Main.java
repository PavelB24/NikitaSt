package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        byte b = 10;

        String str = "ghgh";

        String str2 = new String("Hello");

        Cat cat = new Cat(5, "Liza");
        Cat cat2 = new Cat(7, "ACAT");

        cat.printInfo();
        cat2.printInfo();

        int[] intArr = new int[100];

        Random random = new Random();
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = random.nextInt();
        }

        ///////////////////////////////

        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }


    }

}