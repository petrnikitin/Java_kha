package io.khasang.oop_lessons.homework_sorting;

import java.util.Arrays;

public class Sortdown {


    public static void main(String[] args) {


        Utils util = new Utils();
        Input input = new Input();
        int[] params = input.getInts();
        System.out.println(util.sortBubble(params));


    }


}
