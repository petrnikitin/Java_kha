package io.khasang.oop_lessons.sort_hard;

public class Main2 {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[3];
        fruits[0] = new Fruit();
        fruits[0].weight = 111;
        fruits[1] = new Fruit();
        fruits[1].weight = 2;
        fruits[2] = new Fruit();
        fruits[2].weight = 42;

        for (int i = 0; i < fruits.length; i++) {
            Fruit fruit = fruits[i];
            System.out.println(fruits[i].weight);

        }

        for (Fruit fruit : fruits) {
            System.out.println(fruit.weight);
        }

        //iter+ enter
        for (Fruit fruit : fruits) {

        }

        for (int i = 0; i < fruits.length; i++) {
            for (int j = i + 1; j < fruits.length; j++) {
                if (fruits[i].weight > fruits[j].weight) {
                    Fruit temp = fruits[i];
                    fruits[i] = fruits[j];
                    fruits[j] = temp;
                }

            }

        }
        System.out.println();

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i].weight);

        }
    }
}
