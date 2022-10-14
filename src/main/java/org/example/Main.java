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

        Elephant elephant = new Elephant();

        Animal[] animals = new Animal[2];
        animals[0] = cat;
        animals[1] = elephant;

        Animal animal = new Cat(1, "Barsik");
        Animal animal1 = new Elephant();

//        Creature creature = new Creature();

        animal.sleep();
        animal1.sleep();
        foo(elephant);

        EatAble eatAble = new Elephant();

        EatAble[] eatAbles = new EatAble[2];


        foo2(new EatAble() {
            @Override
            public void eat(String food) {

            }
        });





        int[] intArr = new int[100];

//        Random random = new Random();
//        for (int i = 0; i < intArr.length; i++) {
//            intArr[i] = random.nextInt();
//        }

        ///////////////////////////////

//        for (int i = 0; i < intArr.length; i++) {
//            System.out.println(intArr[i]);
//        }


    }

    public static  void foo(Animal cat){

    }

    public static void foo2(EatAble e){
        //
        //
        //
        //
        e.eat("");
    }

}