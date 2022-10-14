package org.example;

public class Cat extends Animal implements EatAble {

    static int counter = 0;

    int age;
    String name;


    public Cat(int age, String name){
        this.age = age;
        this.name = name;
        counter++;
    }

    public void foo(){}

    @Override
    public void printInfo() {
        System.out.println(name + " " + age);
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println(name + " " + "Проспала 7 часов");
    }

    @Override
    public void eat(String food) {
        System.out.println(name + " " + "eat" + " " + food);
    }
}
