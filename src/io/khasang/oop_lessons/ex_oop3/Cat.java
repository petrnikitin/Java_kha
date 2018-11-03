package io.khasang.oop_lessons.ex_oop3;


public class Cat {
//ПЕРЕМЕННЫЕ, ХАРАКТЕРИСТИКИ КЛАССА
    String name;// this.name
    int age;// this.age
    int weight; // this.weight


    //КОНСТРУКТОРЫ

    Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;

    }

    public Cat() {

    }


// МЕТОДЫ


    void mur() {
        System.out.println("murr");
    }


}


