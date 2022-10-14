package org.example;

public abstract class Animal extends Creature {

    abstract public void printInfo();

    public void sleep(){
        System.out.println("Цикл сна начался");
    }
}
