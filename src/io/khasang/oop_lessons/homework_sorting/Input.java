package io.khasang.oop_lessons.homework_sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Input {


    int[] getInts() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Введите число");
            if (scanner.hasNextInt()) {
                numbers[i] = scanner.nextInt();
            } else {
                System.out.println("Вы ввели что-то другое");
                String temp = scanner.nextLine();
            }
        }
        return numbers;
    }


}
