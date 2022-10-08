package org.example;

public class Cat {

    static int counter = 0;

    int age;
    String name;


    public Cat(int age, String name){
        this.age = age;
        this.name = name;
        counter++;
    }

    public void printInfo(){
        System.out.println(name + " " + age);
    }
}
