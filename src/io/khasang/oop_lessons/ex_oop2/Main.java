package io.khasang.oop_lessons.ex_oop2;

public class Main {
    public static void main(String[] args) {
        final int SIZE = 10; //переменную нельзя изменить, модификатор final
        // массив ДЛЯ кошек
        Cat[] cats = new Cat[SIZE];
        cats[0] = new Cat();
        cats[0].mur();
        cats[0].name = "Tom";
        cats[0].age = 4;
        cats[0].weight = 2;

        System.out.println(feedCat(cats[0]));






       // names[0] = "Tom";
        //ages[0] = 10;
        //weights[0] = 2;
        //System.out.println(feedCat(names[0], ages[0], weights[0]));


    }

    private static String feedCat(Cat cat) {
        if (cat.age > 10){
            cat.weight += 1;
        } else{
            cat.weight += 2;
        }

        return cat.name + " Вес стал " + cat.weight;
    }

    static String feedCat(String name, int age, int weight) {
        if (age > 10){
            weight += 1;
        } else{
            weight += 2;
        }

        return name + "Вес стал" + weight;
    }
}
