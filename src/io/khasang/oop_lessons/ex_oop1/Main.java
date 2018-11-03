package io.khasang.oop_lessons.ex_oop1;

public class Main {
    public static void main(String[] args) {
        final int SIZE = 10; //переменную нельзя изменить, модификатор final
        String[] names = new String[SIZE];
        int[] ages = new int[SIZE];
        int[] weights = new int[SIZE];

        names[0] = "Tom";
        ages[0] = 10;
        weights[0] = 2;
        System.out.println(feedCat(names[0], ages[0], weights[0]));


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
