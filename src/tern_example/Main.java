package tern_example;

public class Main {
    public static void main(String[] args) {
        boolean isFirstPlayer;
        isFirstPlayer = true;

        if (isFirstPlayer) {
            isFirstPlayer = false;

        } else {
            isFirstPlayer = true;
        }


        isFirstPlayer = isFirstPlayer ? false : true;
    // Нвзывние переменной = логическоевыражение ? выражение1 : выражение2


        int i;
        i = -10;
        i = i < 0 ? -i : i;
        System.out.println(i);


        int k = 10;
        int j = 20;
        i = k > j ? k : j;
        System.out.println(i);
    }
}
